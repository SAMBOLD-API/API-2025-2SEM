-- MySQL 8.x
CREATE DATABASE IF NOT EXISTS SAMBOLDAPI DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE SAMBOLDAPI;

CREATE TABLE IF NOT EXISTS usuario (
  email   VARCHAR(50)  NOT NULL PRIMARY KEY,
  nome    VARCHAR(100) NOT NULL,
  curso   VARCHAR(250) NOT NULL,
  senha   VARCHAR(128) NOT NULL,  -- hash hex
  perfil  INT NOT NULL,           -- 1=aluno, 2=prof, 3=tg
  _status INT DEFAULT 1           -- 0=inativo,1=ativo
);

CREATE TABLE IF NOT EXISTS solicitacao (
  email_aluno VARCHAR(50) NOT NULL,
  email_prof  VARCHAR(50) NOT NULL,
  _status     INT NOT NULL,       -- 1=pendente,2=aceito,3=recusado
  data        DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (email_aluno, email_prof),
  CONSTRAINT fk_s_aluno FOREIGN KEY (email_aluno) REFERENCES usuario(email) ON DELETE CASCADE,
  CONSTRAINT fk_s_prof  FOREIGN KEY (email_prof)  REFERENCES usuario(email) ON DELETE CASCADE,
  INDEX idx_status (_status)
);

CREATE TABLE IF NOT EXISTS TG_ALUNO (
  email_aluno VARCHAR(50) NOT NULL,
  email_prof  VARCHAR(50) NOT NULL,
  arquivo     LONGBLOB    NOT NULL,
  data        DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (email_aluno, email_prof),
  CONSTRAINT fk_tg_aluno FOREIGN KEY (email_aluno) REFERENCES usuario(email) ON DELETE CASCADE,
  CONSTRAINT fk_tg_prof  FOREIGN KEY (email_prof)  REFERENCES usuario(email)  ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS arquivo_prof_aluno (
  email_prof  VARCHAR(50) NOT NULL,
  email_aluno VARCHAR(50) NOT NULL,
  arquivo     LONGBLOB    NOT NULL,
  data        DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (email_aluno, email_prof),
  CONSTRAINT fk_ap_aluno FOREIGN KEY (email_aluno) REFERENCES usuario(email) ON DELETE CASCADE,
  CONSTRAINT fk_ap_prof  FOREIGN KEY (email_prof)  REFERENCES usuario(email)  ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS arquivo_prof (
  email_prof  VARCHAR(50) NOT NULL PRIMARY KEY,
  arquivo     LONGBLOB    NOT NULL,
  data        DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  CONSTRAINT fk_arq_prof FOREIGN KEY (email_prof) REFERENCES usuario(email) ON DELETE CASCADE
);

-- Chat: 1 registro por par aluno-prof, histórico guardado em JSON no campo 'arquivo' (nome mantido para compatibilidade)
CREATE TABLE IF NOT EXISTS chat (
  email_aluno VARCHAR(50) NOT NULL,
  email_prof  VARCHAR(50) NOT NULL,
  arquivo     LONGTEXT    NOT NULL, -- JSON array de mensagens
  PRIMARY KEY (email_aluno, email_prof),
  CONSTRAINT fk_c_aluno FOREIGN KEY (email_aluno) REFERENCES usuario(email) ON DELETE CASCADE,
  CONSTRAINT fk_c_prof  FOREIGN KEY (email_prof)  REFERENCES usuario(email)  ON DELETE CASCADE
);


USE SAMBOLDAPI;

-- ALUNOS (perfil = 1)
INSERT IGNORE INTO usuario (email, nome, curso, senha, perfil, _status) VALUES
('ana.aluna@uni.com',       'Ana Aluna',        'Engenharia de Software', '123', 1, 1),
('bruno.estudante@uni.com', 'Bruno Estudante',  'Sistemas de Informação', '123', 1, 1),
('carla.aluna@uni.com',     'Carla Aluna',      'Ciência da Computação',  '123', 1, 1),
('diego.aluno@uni.com',     'Diego Aluno',      'Engenharia de Computação','123', 1, 1);

-- PROFESSORES (perfil = 2)
INSERT IGNORE INTO usuario (email, nome, curso, senha, perfil, _status) VALUES
('prof1@uni.com',           'Professor Um',     'Engenharia de Software', '123', 2, 1),
('prof2@uni.com',           'Professor Dois',   'Sistemas de Informação', '123', 2, 1),
('prof3@uni.com',           'Professor Três',   'Ciência da Computação',  '123', 2, 1);

-- ORIENTADORES/TG (perfil = 3)
INSERT IGNORE INTO usuario (email, nome, curso, senha, perfil, _status) VALUES
('tg1@uni.com',             'Orientador TG 1',  'Computação',             '123', 3, 1),
('tg2@uni.com',             'Orientador TG 2',  'Computação',             '123', 3, 1);

-- MENSAGENS DO CHAT
CREATE TABLE IF NOT EXISTS chat_mensagem (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  email_aluno VARCHAR(50) NOT NULL,
  email_prof VARCHAR(50) NOT NULL,
  sender VARCHAR(10) NOT NULL, -- 'aluno' ou 'prof'
  texto TEXT NOT NULL,
  created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT fk_cm_aluno FOREIGN KEY (email_aluno) REFERENCES usuario(email) ON DELETE CASCADE,
  CONSTRAINT fk_cm_prof  FOREIGN KEY (email_prof)  REFERENCES usuario(email) ON DELETE CASCADE,
  INDEX idx_chat_pair (email_aluno, email_prof)
);