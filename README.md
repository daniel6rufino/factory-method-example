# 🎸 Factory Method - Exemplo em Java

Este repositório contém um exemplo didático do padrão de projeto **Factory Method**, implementado em Java. O projeto foi desenvolvido como atividade em grupo para a disciplina de **Padrões de Projeto** no curso de Análise e Desenvolvimento de Sistemas/AMS (FATEC ZL).

## 💡 Objetivo

Demonstrar como o padrão **Factory Method** pode ser utilizado para criar objetos de forma flexível.

Neste exemplo, utilizamos músicos (`Musician`) e performances para representar o conceito de criação de objetos por meio de subclasses.

## 🧱 Estrutura do Projeto

```plaintext
├── src/
│   ├── musicians/
│   │   ├── Musician.java
│   │   └── Bassist.java
│   ├── performances/
│   │   ├── Performance.java
│   │   └── BassistPerformance.java
│   └── App.java
├── bin/             # Gerado após compilação
└── README.md
```