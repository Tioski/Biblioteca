# 📚 Biblioteca

Sistema simples de biblioteca em **Java**, executado pelo terminal. Foi o meu primeiro projeto na linguagem, desenvolvido como avaliação da disciplina de **Programação Orientada a Objetos (POO)** no curso de Análise e Desenvolvimento de Sistemas (IFSC).

## ✨ Funcionalidades

O sistema trabalha com um acervo fixo de 3 livros e oferece um menu interativo:

| Opção | O que faz |
|-------|-----------|
| `1` - Acervo de Livros | Lista todos os livros com título, autor, ano de publicação e disponibilidade |
| `2` - Consultar Livro | Busca um livro pelo título (sem diferenciar maiúsculas/minúsculas) e informa se está disponível |
| `3` - Empréstimo | Empresta um livro do acervo e marca como indisponível |
| `0` - Sair | Encerra o programa |

### Acervo inicial

- *O Poder dos Quietos* — Susan Cain (2012)
- *O Alienista* — Machado de Assis (1882)
- *Java para Leigos* — Barry Burd (2006)

## 🗂️ Estrutura

```
Biblioteca/
├── src/
│   ├── Livro.java   # Classe que representa um livro (atributos privados + getters/setters)
│   └── Main.java    # Menu interativo e lógica do sistema
└── README.md
```

## 🧠 Conceitos aplicados

- Classes e objetos
- Encapsulamento (atributos `private` com getters e setters)
- Estruturas de decisão e repetição (`switch`, `if/else`, `while`)
- Entrada de dados com `Scanner`

## ▶️ Como executar

Pré-requisito: **JDK 8 ou superior** instalado.

```bash
# clonar o repositório
git clone https://github.com/Tioski/Biblioteca.git
cd Biblioteca

# compilar
javac -d out src/*.java

# executar
java -cp out Main


---

Feito por [Tioski](https://github.com/Tioski) 💻
