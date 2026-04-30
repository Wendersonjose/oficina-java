# 🔧 Sistema de Oficina Mecânica

Sistema de gestão de oficina mecânica desenvolvido em Java com foco em Programação Orientada a Objetos.

Aplicação completa para gerenciamento de ordens de serviço, incluindo cadastro de clientes, veículos, peças e serviços, com cálculo automático de valores e controle de status.

---

## 🎯 Funcionalidades

- Gerenciamento completo de clientes e veículos
- Cadastro de peças com cálculo automático de subtotais
- Catálogo de serviços disponíveis
- Geração de ordens de serviço integradas
- Controle de status da ordem (Aberta, Em Andamento, Finalizada, Cancelada)
- Cálculo automático do valor total

---

## 🚀 Tecnologias

- **Java 17**
- **Console interativo** (Scanner)

---

## 📋 Funcionalidades Implementadas

- ✅ Cadastro de Cliente (com validações de CPF e email)
- ✅ Cadastro de Veículo vinculado ao cliente
- ✅ Cadastro de Peça (com cálculo automático de total)
- ✅ Cadastro de Serviço
- ✅ Geração de Ordem de Serviço completa
- ✅ Controle de Status (Aberta, Em Andamento, Finalizada, Cancelada)
- ✅ Cálculo automático do valor total da ordem

---

## 🧠 Conceitos de POO Aplicados

| Conceito | Aplicação no Projeto |
|----------|---------------------|
| **Encapsulamento** | Atributos privados com getters/setters |
| **Composição** | Cliente → Veículo → OrdemServico |
| **Validação** | CPF, email, valores positivos |
| **Enums** | StatusOrdem (estados da ordem) |
| **toString()** | Formatação de saída de dados |
| **Construtores** | Garantia de consistência dos objetos |

---

## 📂 Estrutura do Projeto

```
oficinateste/
├── src/
│   ├── Main.java
│   └── br/com/wenderson/oficina/modelos/
│       ├── Cliente.java
│       ├── Veiculo.java
│       ├── Peca.java
│       ├── Servico.java
│       ├── OrdemServico.java
│       └── StatusOrdem.java (enum)
└── Readme.md
```

---

## ▶️ Como Executar

1. **Clone ou baixe o projeto**
2. **Compile o código:**
   ```bash
   javac src/Main.java src/br/com/wenderson/oficina/modelos/*.java
   ```
3. **Execute:**
   ```bash
   java -cp src Main
   ```
4. **Siga as instruções no console** para cadastrar cliente, veículo, peça e serviço

---

## 🔄 Próximas Evoluções Planejadas

### Curto Prazo
- [ ] Suporte a múltiplas peças e serviços por ordem
- [ ] Menu interativo com opções de consulta
- [ ] Validação avançada de CPF (dígitos verificadores)
- [ ] Tratamento de exceções no Main

### Médio Prazo
- [ ] Persistência de dados (arquivos ou banco de dados)
- [ ] Classe de serviço para gerenciar múltiplas ordens
- [ ] Testes unitários com JUnit
- [ ] Relatórios (faturamento, ordens por status)

### Longo Prazo
- [ ] Migração para Spring Boot (API REST)
- [ ] Interface web (Thymeleaf ou React)
- [ ] Autenticação e controle de acesso
- [ ] Deploy em nuvem

---

## 📚 Aprendizados do Projeto

- Modelagem de domínio orientada a objetos
- Importância das validações de entrada
- Composição vs herança
- Organização de código em pacotes
- Uso de enums para estados fixos

---

## 👨‍💻 Autor

<div align="center">

### **Wenderson José da Silva**

Desenvolvedor Java em formação, focado em **Backend** e **Arquitetura de Software**.  
Este projeto faz parte da minha jornada de aprendizado em **Programação Orientada a Objetos** e **boas práticas de desenvolvimento**.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/wenderson-jose)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/wenderson-jose)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:wenderson.dev@email.com)

💡 *Sempre aberto a feedbacks e sugestões para melhoria do código!*

</div>

---

## 📝 Status

🚧 **Em desenvolvimento ativo** - Projeto de estudos e prática de POO