# API-2025-2SEM
<div style="width:300px; aspect-ratio:16/9;">
  <img src="https://github.com/SAMBOLD-API/API-2025-2SEM/blob/main/docs/Img/imgLogo.jpeg" alt="Logo" style="width:100%; height:100%; object-fit:cover;">
</div>

<div align="center">
<a href='#topo'
<a href="#desafio"> 🎯 Desafio </a> |
<a href="#proposta"> ✅ Proposta de Solução </a> |
<a href="#product-backlog"> 📖 Backlog do Produto </a> | 
<a href="#dor"> DoR </a> |
<a href="#dod"> DoD </a> |  
<a href="#sprints"> 📌 Sprints </a> |
<a href="#sprint-backlog2"> 📖 Sprint 2 Backlog </a> |
<a href="#sprint-backlog3"> 📖 Sprint 3 Backlog </a> |
<a href="#tecnologias"> 💻 Tecnologias </a> |
<a href="#Manual de Instalação"> 📘 Manual de Instalação </a> |
<a href="#membros"> 👥 Membros </a> 
</div>

<br>

<h1 id='desafio'> 🎯 Desafio </h1>
Desenvolver uma aplicação Java para correção de TGs. A aplicação deve permitir um meio de comunicação entre orientador e orientando, otimizando o envio de perguntas pelo orientando e o feedback pelo orientador, sendo também acessível o histórico das mensagens entre as duas partes. Além disso, haverá materiais auxiliares (modelo de TG e manual do TG) disponíveis para o aluno.

<br>

<h1 id='proposta'> ✅ Proposta de Solução </h1>
A Sambold permitirá que os usuários se cadastrem e façam login no sistema, onde terão a opção de escolher o professor pelo qual desejam ser orientados e iniciar um chat com ele para receber a ajuda necessária na realização do TG. O chat estará disponível para ambas as partes, servindo como histórico. Também haverá, dentro do software, o manual do TG e o modelo de TG disponíveis para fácil acesso como material de apoio ao aluno.

<br>

<h2 id='product-backlog'> 📖 Backlog do Produto </h2>

| Rank | Prioridade | User Story | Story Points | Sprint | 
|-------|------------|------------|----------------|---------|
| 1 | ALTA | Como orientador ou orientando, quero poder entrar no sistema. | 3 | 2 | 
| 2 | ALTA | Como professor de TG, quero poder gerenciar os orientadores. | 5 | 2 | 
| 3 | ALTA | Como orientando, quero poder enviar um pedido de orientação escolhendo o orientador que desejo para começar o acompanhamento. | 3 | 2 | 
| 4 | ALTA | Como orientador, quero poder aprovar ou recusar pedidos de orientação. | 3 | 2 |
| 5 | ALTA | Como orientador ou orientando, quero poder enviar e guardar documentos e ter acesso a eles. | 5 | 3 | 
| 6 | ALTA | Como orientando, quero ter um espaço no sistema para conversar, tirar dúvidas e receber feedback do orientador. | 8 | 2 |
| 7 | MÉDIA | Como orientador e orientando, quero que o sistema guarde o histórico de pedidos e alterações para poder consultar depois. | 8 | 2 | 
| 8 | MÉDIA | Como orientador, quero ter ferramentas fáceis para organizar e gerenciar meus orientandos em um só lugar. | 3 | 3 | 
| 9 | MÉDIA | Como orientando, quero poder alterar meus dados de cadastro. | 3 | 3 | 
| 10 | BAIXA | Como orientando, quero ser notificado se meu pedido de orientação foi aceito ou rejeitado. | 3 | 3 | 

<br>

<h2 id='dor'> DoR (Definition of Ready) </h2>

- User Stories detalhadas com *critérios de aceitação*  
- Subtarefas dividas a partir das US  
- Design no Figma  
- Modelagem do Banco de Dados  
- Banco de Dados Vetorizado do Cliente     

<br>

<h2 id='dod'> DoD (Definition of Done) </h2>

- Manual do Usuário
- Manual da Aplicação   
- Documentação da API (Application Programming Interface)  
- Documentação de uso atualizada    

<br>


<h2 id='sprints'> 📌 Sprints </h2>

| Sprint | Período | Entregas | Status |
|--------|---------|----------|--------|
| 1 | 08/09 - 28/09 | Planejamento inicial, Protótipos Visuais | ✅ |
| 2 | 06/10 - 26/10 | Cadastro/Login, Enviar/Receber Pedido de Orientação, Chat entre Orientador e Orientando, Histórico de Mensagens  | 🟡 |
| 3 | 03/11 - 23/11 | Armazenamento de Documentos, Ferramentas para Gerenciamento de Orientandos, Alteração de Dados de Cadastro, Notificação de Resposta ao Pedido de Orientação | 🟠 |

<br>

<h2 id='sprint-backlog2'> 📖 Sprint 2 Backlog </h2>

| Capacidade estimada da equipe por sprint | 22 Story Points |
|------------------------------------------|-----------------|
| *Meta da Sprint*                       | User Stories de rank 1, 2, 3, 4 (total de 16 Story Points) |
| *Previsão da Sprint (extras, sem compromisso de entrega)* | User Stories de rank 6 e rank 7 (21 Story Points) |

| Rank | Prioridade | User Story | Estimativa | Sprint |
|------|------------|------------|------------|--------|
| 1 | ALTA | Como orientador ou orientando, quero poder entrar no sistema. | 3 | 2 |
| 2 | ALTA | Como professor de TG, quero poder gerenciar os orientadores. | 3 | 2 | 
| 3 | ALTA | Como orientando, quero poder enviar um pedido de orientação escolhendo o orientador que desejo para começar o acompanhamento. | 5 | 2 | 
| 4 | ALTA | Como orientador, quero poder aprovar ou recusar pedidos de orientação. | 5 | 2 |
| 6 | ALTA | Como orientando, quero ter um espaço no sistema para conversar, tirar dúvidas e receber feedback do orientador. | 13 | 2 | 
| 7 | MÉDIA | Como orientador e orientando, quero que o sistema guarde o histórico de pedidos e alterações para poder consultar depois. | 8 | 2 | 

<br>

<h2 id='dor2'> DoR (Definition of Ready) </h2>

- User Stories detalhadas com critérios de aceitação  
- Protótipos de interface aprovados  
- Definição das regras de login e cadastro  
- Ambiente de desenvolvimento configurado (Visual Studio Code)  
- Definição do modo de cadastro dos orientadores  
- Definição da lógica de pedidos de orientação e como gerenciá-los  
- Definição de como é desejada a interação entre orientador e orientando  
- Definição do acesso às conversas anteriores  

<br>

<h2 id='dod2'> DoD (Definition of Done) </h2>

- Código implementado em Java  
- Testes de envio de dados no banco realizados  
- Documentação de uso atualizada  
- Funcionalidades propostas integradas em diferentes telas  

<br>

<h2 id='sprint-backlog3'> 📖 Sprint 3 Backlog </h2>

| Capacidade estimada da equipe por sprint | 22 Story Points |
|------------------------------------------|-----------------|
| *Meta da Sprint*                       | User Stories de rank 5 e rank 8 (total de 13 Story Points) |
| *Previsão da Sprint (extras, sem compromisso de entrega)* | User Stories de rank 9 e rank 10 (6 Story Points) |

| Rank | Prioridade | User Story | Estimativa | Sprint |
|------|------------|------------|------------|--------|
| 5 | ALTA | Como orientador ou orientando, quero poder enviar e guardar documentos e ter acesso a eles. | 8 | 3 | 
| 8 | MÉDIA | Como orientador, quero ter ferramentas fáceis para organizar e gerenciar meus orientandos em um só lugar. | 5 | 3 | 
| 9 | MÉDIA | Como orientando, quero poder alterar meus dados de cadastro. | 3 | 3 | 
| 10 | BAIXA | Como orientando, quero ser notificado se meu pedido de orientação foi aceito ou rejeitado. | 3 | 3 | 

<br>

<h2 id='dor3'> DoR (Definition of Ready) </h2>
 
- Identificação do envio e armazenamento de documentos  
- Identificação de uma interface intuitiva para gerenciamento de orientandos  
- Identificação da maneira desejada para alterar os dados de cadastro  
- Identificação das regras para notificação do pedido de orientação    

<br>

<h2 id='dod3'> DoD (Definition of Done) </h2>

- Código implementado em Java  
- Testes de envio de dados no banco realizados  
- Documentação de uso atualizada  
- Funcionalidades propostas integradas em diferentes telas  

<br>

<h2 id='tecnologias'> 💻 Tecnologias </h2>

[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![Jira](https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=jira&logoColor=white)](https://www.atlassian.com/software/jira)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Scrum](https://img.shields.io/badge/Scrum-6DB33F?style=for-the-badge&logo=scrumalliance&logoColor=white)](https://www.scrumalliance.org/)
[![Figma](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white)](https://www.figma.com/)

<br>

<h2 id='Manual de Instalação'> 📘 Manual de Instalação </h2>

## 🛠️ Pré-requisitos

Antes de iniciar, certifique-se de ter os seguintes programas instalados:

- Git [(Download)](https://git-scm.com/downloads))
- Java 24+ [(Download)](https://www.oracle.com/java/technologies/javase-downloads.html)
- Maven [(Download)](https://maven.apache.org/download.cgi)
- Visual Studio Code [(Download)]((https://code.visualstudio.com/download))
- MySQL Workbench [(Download)](https://dev.mysql.com/downloads/workbench/))

---

## 🔹 Git

O Git é um sistema de controle de versão distribuído, usado para gerenciar projetos de software.

### 📥 Instalação:
1. Acesse o site oficial: [Download Git](https://git-scm.com/downloads)
2. Escolha a versão compatível com seu sistema operacional (Windows, macOS, Linux).
3. Execute o instalador e siga as instruções padrão.
4. Para verificar se foi instalado corretamente, abra o terminal e digite:
   ```bash
   git --version
   ```

---

## 🔹 Java (JDK)

O Java é necessário para rodar o backend e algumas ferramentas como o Maven.

### 📥 Instalação:
1. Acesse: [Download Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
2. Baixe a versão **Java SE Development Kit (24 ou superior)**.
3. Instale o pacote e configure a variável de ambiente `JAVA_HOME`.
4. Para verificar a instalação:
   ```bash
   java -version
   ```

---

## 🔹 Maven

O Maven é uma ferramenta de automação e gerenciamento de dependências para projetos Java.

### 📥 Instalação:
1. Baixe em: [Download Maven](https://maven.apache.org/download.cgi)
2. Extraia o arquivo `.zip` em uma pasta (ex: `C:\apache-maven`).
3. Configure a variável de ambiente:
   - Adicione `C:\apache-maven\bin` ao `PATH`.
4. Verifique a instalação:
   ```bash
   mvn -version
   ```

---

## 🔹 Visual Studio Code (VS Code)

O VS Code é o editor recomendado para trabalhar com os projetos.

### 📥 Instalação:
1. Baixe em: [Download VS Code](https://code.visualstudio.com/download)
2. Instale normalmente no Windows/macOS/Linux.
3. Recomendado instalar extensões:
   - Java Extension Pack
   - Maven for Java
   - MySQL
   - GitLens

---

## 🔹 MySQL Workbench

O MySQL Workbench é uma interface gráfica para gerenciar o banco de dados MySQL.

### 📥 Instalação:
1. Baixe em: [Download MySQL Workbench](https://dev.mysql.com/downloads/workbench/)
2. Escolha a versão compatível com seu sistema.
3. Instale normalmente.
4. Configure uma conexão com seu servidor MySQL.
5. Teste acessando o banco com:
   ```sql
   SELECT VERSION();
   ```

---

<br>

<h2 id='membros'> 👥 Membros </h2>

| Foto | Nome | Função | Github |
| :---------: | :---------: | :---------------------: | :-----------------: |
| <img src="https://github.com/LeonardoGracianoOliveira.png?size=50" width=50px> | Leonardo Graciano | Scrum Master | <a href="https://github.com/LeonardoGracianoOliveira"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a> |
| <img src="https://github.com/joaosantos13.png?size=50" width=50px> | João Santos | Product Owner | <a href="https://github.com/joaosantos13"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a>|
| <img src="https://github.com/saracostacarreira.png?size=50" width=50px> | Sara Alves | Desenvolvedora | <a href="https://github.com/saracostacarreira"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a>  |
| <img src="https://github.com/MrMatheTrue.png?size=50" width=50px> | Matheus de Paula | Desenvolvedor | <a href="https://github.com/MrMatheTrue"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a> |
| <img src="https://github.com/danieldanka.png?size=50" width=50px> | Daniel Natan | Desenvolvedor | <a href="https://github.com/danieldanka"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a> |
| <img src="https://github.com/GlitchRez1.png?size=50" width=50px> | Samuel Rezende | Desenvolvedor | <a href="https://github.com/GlitchRez"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a> |
| <img src="https://github.com/brendabettini.png?size=50" width=50px> | Brenda Bettini | Desenvolvedora | <a href="https://github.com/brendabettini"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a> |
| <img src="https://github.com/ana-franca-01.png?size=50" width=50px> | Ana Letícia | Desenvolvedora | <a href="https://github.com/ana-franca-01"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"></a> |
