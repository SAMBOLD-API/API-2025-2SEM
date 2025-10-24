## 🧪 Relatório de Testes

Nesta sprint, foram realizados testes funcionais e de integração para validar as funcionalidades desenvolvidas.  
Os testes foram feitos manualmente e automatizados (quando aplicável), garantindo que todas as *User Stories* atendessem aos critérios de aceitação definidos na **Definition of Done (DoD)**.

---

### 🧩 Funcionalidades Testadas

| ID | Funcionalidade | Tipo de Teste | Objetivo | Resultado |
|----|----------------|----------------|-----------|------------|
| T01 | Envio e recebimento de mensagens no chat em tempo real | Funcional | Verificar se aluno e professor conseguem trocar mensagens instantaneamente. | ✅ Aprovado |
| T02 | Criação de solicitação de orientação | Funcional | Validar se o aluno consegue selecionar um professor e enviar uma solicitação. | ✅ Aprovado |
| T03 | Aceite ou recusa de solicitação pelo professor | Funcional | Garantir que o professor consiga visualizar, aceitar ou recusar pedidos de orientação. | ✅ Aprovado |
| T04 | Exibição do histórico de TGs e solicitações anteriores | Funcional / Visual | Confirmar que o aluno pode visualizar o histórico completo de orientações e seus status. | ✅ Aprovado |
| T05 | Cadastro de novos professores pelo professor de TG | Funcional | Verificar se o cadastro é feito corretamente e armazenado no banco de dados. | ✅ Aprovado |
| T06 | Persistência local das informações (SQLite) | Integração | Validar se os dados de chat, solicitações e cadastros estão sendo salvos e recuperados corretamente. | ✅ Aprovado |
| T07 | Interface e fluxo de navegação entre telas | Usabilidade | Avaliar se o fluxo entre chat, histórico e solicitações está funcional e intuitivo. | ✅ Aprovado |

---

### 🧾 Evidências dos Testes

Foram registradas em video demonstrando as principais validações realizadas:
- ✅ Envio e recebimento de mensagens funcionando em tempo real.  
- ✅ Cadastro e login dos professores de TG operando corretamente.  
- ✅ Solicitação enviada e recebida conforme esperado.  
- ✅ Histórico exibindo status “Aceito” e “Recusado” de forma adequada.  
- ✅ Dados armazenados e recuperados via SQLite após reinício da aplicação.
[Vídeo dos Testes](https://www.google.com) 🎬
