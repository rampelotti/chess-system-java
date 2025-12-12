# Sistema de Xadrez em Java (Console)

Este é um projeto de jogo de xadrez totalmente funcional desenvolvido em Java, projetado para ser jogado diretamente no terminal (console). O projeto aplica conceitos fundamentais de Programação Orientada a Objetos (POO) e manipulação de estruturas de dados.

## 📋 Resumo do Projeto

O jogo simula uma partida completa de xadrez entre dois jogadores (Branco e Preto). Ele implementa todas as regras oficiais do xadrez, incluindo movimentação de peças, capturas e jogadas especiais. A interface é renderizada no console utilizando códigos de cores ANSI para distinguir as peças e o tabuleiro.

### Principais Funcionalidades:
- **Movimentação de Peças**: Validação de movimentos para todas as peças (Rei, Rainha, Bispo, Cavalo, Torre, Peão).
- **Captura de Peças**: Gerenciamento de peças capturadas e remoção do tabuleiro.
- **Xeque e Xeque-Mate**: Detecção automática de estados de xeque e fim de jogo.
- **Jogadas Especiais**:
  - **Roque (Castling)**: Pequeno e Grande (Kingside e Queenside).
  - **En Passant**: Regra de captura especial para peões.
  - **Promoção**: Promoção de peão ao chegar na última linha (para Bispo, Cavalo, Torre ou Rainha).
- **Visualização**: Tabuleiro colorido e destaque de movimentos possíveis.
- **Turnos**: Controle de turnos e alternância de jogadores.

## 🛠️ Ferramentas e Tecnologias

- **Linguagem**: Java (JDK 8+).
- **Paradigma**: Programação Orientada a Objetos (POO).
- **Interface**: Console/Terminal (System.out).
- **Entrada de Dados**: `java.util.Scanner` para leitura de coordenadas.
- **Tratamento de Exceções**: Exceções personalizadas (`ChessException`, `BoardException`) para regras inválidas.

## 🎮 Como Jogar (Via Terminal)

Para jogar, você precisará ter o **Java Development Kit (JDK)** instalado em sua máquina.

### Passo 1: Abrir o Terminal
Navegue até a pasta raiz do projeto (onde este `README.md` está localizado).

### Passo 2: Compilar o Código
Compile os arquivos fonte gerando os binários em uma pasta separada (ex: `bin`). Execute o seguinte comando:

```bash
javac -d bin -sourcepath src src/application/Program.java
```

### Passo 3: Executar o Jogo
Após compilar sem erros, inicie o programa com o comando:

```bash
java -cp bin application.Program
```

### Interação durante o Jogo
- O jogo pedirá a posição de **Origem** (peça que você quer mover) e **Destino** (para onde ela vai).
- **Formato das Coordenadas**: Digite a letra da coluna seguida do número da linha (ex: `a1`, `e5`, `h8`).
- **Promoção**: Se um peão for promovido, você deverá digitar a inicial da peça desejada: `B` (Bispo), `N` (Cavalo), `R` (Torre) ou `Q` (Rainha).

---
*Divirta-se jogando!*
