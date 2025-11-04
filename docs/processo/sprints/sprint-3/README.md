<div align="center">

<div style="width:300px; aspect-ratio:16/9;">
  <img src="https://github.com/SAMBOLD-API/API-2025-2SEM/blob/main/docs/Img/logo.png" alt="Logo" style="width:100%; height:100%; object-fit:cover;">
</div>

| [Desafio](#-desafio) | [User Stories](#-user-stories) | [DoR](#-definition-of-ready) | [DoD](#-definition-of-done) | [Burndown](#-sprint-burndown) | [Equipe](#-equipe) |

</div>

 **Status da Sprint:** Em Andamento  


# 🥇 Meta  

Implementar funcionalidades que habilitam o aluno **enviar uma nova seção do meu TG**, **visualizar o histórico de feedbacks de cada seção**, **Ter acesso a materiais de apoio**, professor de **visualizar todas as seções enviadas pelos meus alunos orientados**, **enviar um feedback** e administrador de **gerenciar cadastros de professores** e **Ter acesso a todos os professores e alunos**.

---

# 🎯 User Stories  

| Rank | Prioridade | User Story | Estimativa | Status |
| 1 | Alta | Como aluno, quero **enviar uma nova seção do meu TG** para que o professor orientador possa revisá-la. | 5 | 3 | [] |
| 2 | Alta | Como professor, quero **visualizar todas as seções enviadas pelos meus alunos orientados** para organizar as correções pendentes. | 5 | 3 | [] | 
| 3 | Alta | Como professor, quero **enviar um feedback** para guiar o aluno na revisão do TG. | 8 | 3 | [] |
| 4 | Alta | Como administrador, quero **Ter acesso a todos os professores e alunos** para acompanhar o progresso dos TG's. | 8 | 3 | [] | 
| 5 | Média | Como aluno, quero **visualizar o histórico de feedbacks de cada seção** para acompanhar minha evolução e correções anteriores. | 5 | 3 | [] | 
| 6 | Média | Como aluno, quero **Ter acesso a materiais de apoio** para auxiliar a realizção do meu TG. | 5 | 3 | [] |
| 8 | Baixa | Como administrador, quero **gerenciar cadastros de professores** para garantir acesso controlado ao sistema. | 3 | 3 | [] | 
| 9 | Baixa | Como usuário, quero **alterar meus dados de cadastro** caso digite algo incorreto | 3 | 3 | [] |

---

## 🏃 Definition of Ready  

| Critério | Descrição |
|-----------|------------|
|User Story clara e completa | Cada história está escrita no formato “Como [usuário], quero [funcionalidade], para [benefício]”. |
|Critérios de aceitação definidos | Todos os critérios de aceitação foram definidos e validados pelo Product Owner. |
|Sem bloqueios | Nenhuma dependência técnica impede o desenvolvimento da história. |
|História compreendida pela equipe | A equipe compreende o escopo e concorda com a estimativa atribuída. |
|Estimativa realizada | As histórias foram estimadas com base em Planning Poker. |
|Artefatos disponíveis | Foram anexados wireframes das telas de chat, solicitação, histórico e cadastro de professores. |
|Estratégia de testes definida | Foram planejados os testes de envio/recebimento de mensagens, criação de solicitações e cadastro de professores. |

---

# 🎯 User Stories + DoR  

---

## 🧩 User Story 1  
**Como aluno, quero enviar uma nova seção do meu TG para que o professor orientador possa revisá-la.**

### ✅ Definition of Ready  
| Critério | Descrição |
|-----------|------------|
| User Story clara e completa | Escrita no formato correto e descreve claramente o envio de seções do TG. |
| Critérios de aceitação definidos | O envio deve permitir anexar arquivo e vincular ao professor orientador. |
| Sem bloqueios | O backend para envio de arquivos está implementado e funcional. |
| História compreendida pela equipe | Toda a equipe compreende o fluxo de envio e o papel do aluno. |
| Estimativa realizada | Estimada em **5 pontos**, consenso da equipe. |
| Artefatos disponíveis | Wireframe da tela de envio da seção do TG foi anexado. |
| Estratégia de testes definida | Teste de upload, validação de formato e vínculo com orientador planejados. |
<br>

<div style="width:300px; aspect-ratio:16/9;">
  <img src="https://github.com/SAMBOLD-API/API-2025-2SEM/blob/main/docs/Img/Se%C3%A7%C3%B5es%20Aluno.png" alt="Logo" style="width:100%; height:100%; object-fit:cover;">
</div>

---

## 🧩 User Story 2  
**Como professor orientador, quero visualizar todas as seções enviadas pelos meus alunos orientados para organizar as correções pendentes.**

### ✅ Definition of Ready  
| Critério | Descrição |
|-----------|------------|
| User Story clara e completa | Escrita de forma compreensível, define claramente a visualização das seções. |
| Critérios de aceitação definidos | O sistema deve listar seções com nome do aluno, data e status. |
| Sem bloqueios | O endpoint de listagem de seções está disponível. |
| História compreendida pela equipe | Todos compreendem o fluxo de exibição e filtragem. |
| Estimativa realizada | Estimada em **5 pontos**, aprovada pelo time. |
| Artefatos disponíveis | Wireframe da tela de listagem de seções anexado. |
| Estratégia de testes definida | Testes de listagem, filtro por aluno e ordenação planejados. |
<br>

<div style="width:300px; aspect-ratio:16/9;">
  <img src="https://github.com/SAMBOLD-API/API-2025-2SEM/blob/main/docs/Img/Feedback%20Professor.png" alt="Logo" style="width:100%; height:100%; object-fit:cover;">
</div>

---

## 🧩 User Story 3  
**Como professor orientador, quero enviar um feedback para guiar o aluno na revisão do TG.**

### ✅ Definition of Ready  
| Critério | Descrição |
|-----------|------------|
| User Story clara e completa | Escrita no formato adequado, define o envio de feedbacks. |
| Critérios de aceitação definidos | Deve permitir registrar texto de feedback vinculado à seção. |
| Sem bloqueios | Comunicação entre frontend e backend de feedbacks está validada. |
| História compreendida pela equipe | Todos entendem o processo de envio e retorno de feedback. |
| Estimativa realizada | Estimada em **8 pontos**, consenso da equipe. |
| Artefatos disponíveis | Wireframe da tela de feedback anexado. |
| Estratégia de testes definida | Testes de envio, exibição e atualização de feedback programados. |
<br>

<div style="width:300px; aspect-ratio:16/9;">
  <img src="https://github.com/SAMBOLD-API/API-2025-2SEM/blob/main/docs/Img/Feedback%20Professor.png" alt="Logo" style="width:100%; height:100%; object-fit:cover;">
</div>

---

## 🧩 User Story 4  
**Como administrador, quero ter acesso a todos os professores e alunos para acompanhar o progresso dos TGs.**

### ✅ Definition of Ready  
| Critério | Descrição |
|-----------|------------|
| User Story clara e completa | Define claramente o acesso e a finalidade administrativa. |
| Critérios de aceitação definidos | O sistema deve exibir listas com progresso e status. |
| Sem bloqueios | Dados de usuários e progresso já estão disponíveis no banco. |
| História compreendida pela equipe | Todos compreendem a visão administrativa e escopo de acesso. |
| Estimativa realizada | Estimada em **8 pontos**. |
| Artefatos disponíveis | Wireframe do dashboard administrativo anexado. |
| Estratégia de testes definida | Testes de acesso, filtragem e exibição geral planejados. |
<br>

<div style="width:300px; aspect-ratio:16/9;">
  <img src="https://github.com/SAMBOLD-API/API-2025-2SEM/blob/main/docs/Img/Vizualizar%20Professores.png" alt="Logo" style="width:100%; height:100%; object-fit:cover;">
</div>

<div style="width:300px; aspect-ratio:16/9;">
  <img src="https://github.com/SAMBOLD-API/API-2025-2SEM/blob/main/docs/Img/visualizarALunos.png alt="Logo" style="width:100%; height:100%; object-fit:cover;">
</div>

---

## 🧩 User Story 5  
**Como aluno, quero visualizar o histórico de feedbacks de cada seção para acompanhar minha evolução e correções anteriores.**

### ✅ Definition of Ready  
| Critério | Descrição |
|-----------|------------|
| User Story clara e completa | Está no formato correto e detalha o objetivo do aluno. |
| Critérios de aceitação definidos | Deve exibir feedbacks anteriores de cada seção. |
| Sem bloqueios | API de feedback já integrada com o banco de dados. |
| História compreendida pela equipe | A equipe entende a navegação entre seções e histórico. |
| Estimativa realizada | Estimada em **5 pontos**. |
| Artefatos disponíveis | Wireframe do histórico de feedbacks anexado. |
| Estratégia de testes definida | Testes de listagem e ordenação cronológica planejados. |
<br>

<div style="width:300px; aspect-ratio:16/9;">
  <img src="https://github.com/SAMBOLD-API/API-2025-2SEM/blob/main/docs/Img/Se%C3%A7%C3%B5es%20Aluno.png" alt="Logo" style="width:100%; height:100%; object-fit:cover;">
</div>

---

## 🧩 User Story 6  
**Como aluno, quero ter acesso a materiais de apoio para auxiliar a realização do meu TG.**

### ✅ Definition of Ready  
| Critério | Descrição |
|-----------|------------|
| User Story clara e completa | Descreve o acesso e propósito de forma simples e clara. |
| Critérios de aceitação definidos | Deve permitir visualizar e baixar materiais cadastrados. |
| Sem bloqueios | Links e base de dados dos materiais estão disponíveis. |
| História compreendida pela equipe | A equipe entende o fluxo de exibição e download. |
| Estimativa realizada | Estimada em **5 pontos**. |
| Artefatos disponíveis | Wireframe da seção de materiais anexado. |
| Estratégia de testes definida | Testes de exibição, download e validação de arquivo definidos. |
<br>

<div style="width:300px; aspect-ratio:16/9;">
  <img src="https://github.com/SAMBOLD-API/API-2025-2SEM/blob/main/docs/Img/Envio%20Documentos.png" alt="Logo" style="width:100%; height:100%; object-fit:cover;">
</div>
---

## 🧩 User Story 8  
**Como administrador, quero gerenciar cadastros de professores para garantir acesso controlado ao sistema.**

### ✅ Definition of Ready  
| Critério | Descrição |
|-----------|------------|
| User Story clara e completa | Explica claramente a ação administrativa de cadastro. |
| Critérios de aceitação definidos | Deve permitir criar, editar e remover professores. |
| Sem bloqueios | O módulo de autenticação e permissões já implementado. |
| História compreendida pela equipe | A equipe entende a hierarquia e controle de acesso. |
| Estimativa realizada | Estimada em **3 pontos**. |
| Artefatos disponíveis | Wireframe do CRUD de professores anexado. |
| Estratégia de testes definida | Testes de criação, edição e exclusão planejados. |
<br>

<div style="width:300px; aspect-ratio:16/9;">
  <img src="https://github.com/SAMBOLD-API/API-2025-2SEM/blob/main/docs/Img/Vizualizar%20Professores.png" alt="Logo" style="width:100%; height:100%; object-fit:cover;">
</div>

---

## 🧩 User Story 9  
**Como usuário, quero alterar meus dados de cadastro caso digite algo incorreto.**

### ✅ Definition of Ready  
| Critério | Descrição |
|-----------|------------|
| User Story clara e completa | Define o propósito e contexto do usuário. |
| Critérios de aceitação definidos | Deve permitir alterar nome, e-mail e senha. |
| Sem bloqueios | O sistema de autenticação e perfis já está funcional. |
| História compreendida pela equipe | Todos compreendem o fluxo de edição e validação. |
| Estimativa realizada | Estimada em **3 pontos**. |
| Artefatos disponíveis | Wireframe da tela de edição de perfil anexado. |
| Estratégia de testes definida | Testes de atualização e persistência de dados definidos. |
<br>

<div style="width:300px; aspect-ratio:16/9;">
  <img src="https://github.com/SAMBOLD-API/API-2025-2SEM/blob/main/docs/Img/Atualiza%C3%A7%C3%A3o%20de%20perfil.png" alt="Logo" style="width:100%; height:100%; object-fit:cover;">
</div>


## 🏆 Definition of Done  

| Critério | Descrição |
|-----------|------------|
| Código funcional | A funcionalidade foi implementada conforme os critérios de aceitação e testada com sucesso. |
| Branch dedicada criada | Cada história foi desenvolvida em uma branch própria (ex: `feature/chat-realtime`, `feature/cadastro-professor`). |
| Commits padronizados | Mensagens seguem o padrão `feat(#id): descrição`. |
| Code Review realizado | Foi aberto um Pull Request com revisão de pelo menos um membro da equipe. |
| Código limpo | Código sem comentários desnecessários e seguindo boas práticas. |
| Testes executados com sucesso | Testes de envio/recebimento de mensagens, solicitações e cadastro foram executados e aprovados. |
| Documentação atualizada | README, diagramas e documentação técnica foram atualizados no repositório. |
| Demonstração entregue | O incremento foi apresentado ao cliente/professor em vídeo ou review de Sprint. |

---


## 👥 Equipe  

| Foto | Nome | Função | Github |
| :---------: | :---------: | :---------------------: | :-----------------: |
| <img src="https://github.com/LeonardoGracianoOliveira.png?size=50" width=50px> | Leonardo Graciano | Scrum Master | <a href="https://github.com/LeonardoGracianoOliveira"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a> |
| <img src="https://github.com/joaosantos13.png?size=50" width=50px> | João Santos | Product Owner | <a href="https://github.com/joaosantos13"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a>|
| <img src="https://github.com/saracostacarreira.png?size=50" width=50px> | Sara Alves | Desenvolvedora | <a href="https://github.com/saracostacarreira"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a>  |
| <img src="https://github.com/danieldanka.png?size=50" width=50px> | Daniel Natan | Desenvolvedor | <a href="https://github.com/danieldanka"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a> |
| <img src="https://github.com/GlitchRez1.png?size=50" width=50px> | Samuel Rezende | Desenvolvedor | <a href="https://github.com/GlitchRez"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a> |
| <img src="https://github.com/brendabettini.png?size=50" width=50px> | Brenda Bettini | Desenvolvedora | <a href="https://github.com/brendabettini"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a> |
| <img src="https://github.com/ana-franca-01.png?size=50" width=50px> | Ana Letícia | Desenvolvedora | <a href="https://github.com/ana-franca-01"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a> |
