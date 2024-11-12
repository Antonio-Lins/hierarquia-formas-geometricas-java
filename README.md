
Esse README fornecerá uma boa introdução e orientará outros usuários a executarem o projeto.

# Hierarquia de Formas Geométricas em Java

Este projeto implementa uma hierarquia de classes para representar formas geométricas (quadrado, retângulo e círculo) com conceitos de orientação a objetos, incluindo interfaces, classes abstratas e herança. O programa principal permite que o usuário crie uma lista de formas geométricas, calcule e exiba o perímetro e a área de cada forma.

## Estrutura do Projeto

- **Interface `Forma`**: Define os métodos `calcularPerimetro` e `calcularArea`.
- **Classe Abstrata `Quadrilatero`**: Representa formas com quatro lados e implementa o cálculo do perímetro.
- **Classes `Retangulo` e `Quadrado`**: Extendem `Quadrilatero` e implementam o cálculo da área conforme a fórmula de cada tipo.
- **Classe `Circulo`**: Implementa `Forma` diretamente para representar círculos, com cálculo de perímetro (circunferência) e área.

## Funcionalidades

- Permite ao usuário escolher quantas formas criar e especificar o tipo de cada uma (quadrado, retângulo ou círculo).
- Recebe os dados necessários (lado, base e altura, ou raio) para criar cada forma.
- Armazena todas as formas em uma lista e exibe as seguintes informações:
  - Tipo e dimensões da forma
  - Perímetro
  - Área

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/hierarquia-formas-geometricas-java.git
   
2.Navegue até o diretório do projeto:
cd hierarquia-formas-geometricas-java

3.Compile os arquivos .java:
javac *.java

4.Execute o programa principal:
java Principal

Exemplo de Uso
Quantas formas deseja criar? 2

Forma 1:
Escolha (1) Quadrado, (2) Retângulo, ou (3) Círculo: 1
Digite o tamanho do lado do quadrado: 5

Forma 2:
Escolha (1) Quadrado, (2) Retângulo, ou (3) Círculo: 3
Digite o tamanho do raio do círculo: 3

Formas criadas:
Quadrado: lado=5
Perímetro: 20.00
Área: 25.00

Círculo: raio=3
Perímetro: 18.85
Área: 28.27
