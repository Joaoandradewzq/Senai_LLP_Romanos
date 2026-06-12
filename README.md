# Atividade 007 – Conversão de Números Romanos

Este projeto faz parte da disciplina de programação e consiste em implementar um programa em **Java** capaz de converter números romanos em inteiros. O código foi desenvolvido para atender à atividade 007 proposta pelo professor.

## Descrição da Atividade

Os numerais romanos são representados pelos seguintes símbolos:

| Símbolo | Valor |
| --- | --- |
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

Além disso, certos pares de símbolos representam valores obtidos por subtração:

* **IV** = 4  
* **IX** = 9  
* **XL** = 40  
* **XC** = 90  
* **CD** = 400  
* **CM** = 900  

O programa deve ler um número romano e convertê‑lo para o valor inteiro correspondente. Para isso, percorre‑se a string de caracteres da esquerda para a direita: se o valor do símbolo atual for menor que o próximo, subtrai‑se; caso contrário, soma‑se.

## Estrutura do Projeto

O projeto possui os seguintes arquivos:

* **RomanoParaInt.java** — Classe principal que contém o método responsável por converter o número romano em inteiro e a lógica de entrada de dados.
* **README.md** — Este arquivo, contendo a descrição da atividade e instruções de compilação e execução.

## Como compilar

No terminal, navegue até a pasta do projeto e execute:

    javac RomanoParaInt.java

Isso irá gerar o arquivo `RomanoParaInt.class` na pasta atual.

## Como executar

Você pode fornecer a entrada de três formas diferentes:

1. **Por argumento no terminal**:  
   Após a compilação, execute:

       java RomanoParaInt MCMXCIV

   O programa imprimirá o valor inteiro correspondente (`1994`).

2. **Por digitação do usuário via `Scanner`**:  
   Se nenhum argumento for passado, o programa solicitará que você digite o numeral romano. Basta executar:

       java RomanoParaInt

   Em seguida, digite o numeral quando solicitado.

3. **Por pipe/entrada padrão**:  
   Você também pode redirecionar a entrada de um comando ou arquivo. Exemplo:

       echo LXII | java RomanoParaInt

   O programa lerá `LXII` da entrada padrão e imprimirá `62`.

## Contribuições

Esse projeto foi desenvolvido para fins educacionais no contexto da disciplina de programação do SENAI. Contribuições e sugestões são bem‑vindas.
