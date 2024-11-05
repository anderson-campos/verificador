<h1>Projeto: Verificação de Números Pares e Ímpares em Java</h1>

<p>Este projeto em Java implementa um programa que verifica se um número fornecido pelo usuário é par ou ímpar. A lógica do programa é organizada em duas classes distintas, utilizando métodos para realizar a verificação de forma modular e clara.</p>

<h2>Estrutura do Projeto</h2>

<p>O projeto é composto por duas classes, cada uma em um arquivo separado, mas no mesmo pacote:</p>

<ol>
    <li><strong>Classe <code>Main</code></strong>: Esta é a classe principal que controla a execução do programa. Ela lida com a entrada do usuário, captura o número a ser verificado e exibe se o número é par ou ímpar com base no resultado da verificação.</li>
    <li><strong>Classe <code>verificador</code></strong>: Esta classe contém um método estático que executa a lógica de verificação, retornando um valor booleano que indica se o número é par.</li>
</ol>

<h3>Detalhes das Classes</h3>

<ul>
    <li><strong>Classe <code>Main</code></strong>
        <ul>
            <li>Importa a classe <code>Scanner</code> para permitir a entrada de dados do usuário.</li>
            <li>Solicita que o usuário insira um número inteiro.</li>
            <li>Chama o método <code>verificando</code> da classe <code>verificador</code> e armazena o resultado.</li>
            <li>Imprime uma mensagem informando se o número digitado é par ou ímpar.</li>
        </ul>
    </li>
    <li><strong>Classe <code>verificador</code></strong>
        <ul>
            <li>Contém o método estático <code>verificando</code>, que verifica se o número fornecido é par.</li>
            <li>O método utiliza o operador de módulo para determinar a divisibilidade do número por 2, retornando <code>true</code> se o número for par e <code>false</code> se for ímpar.</li>
        </ul>
    </li>
</ul>

<h2>Objetivos do Projeto</h2>

<p>Os principais objetivos deste projeto são:</p>

<ol>
    <li><strong>Implementar uma Verificação Simples</strong>: Demonstrar a verificação da paridade de um número utilizando métodos em Java.</li>
    <li><strong>Organização do Código</strong>: Separar a lógica de verificação em uma classe específica, promovendo a clareza e a reutilização do código.</li>
    <li><strong>Uso de Métodos</strong>: Mostrar a importância do uso de métodos para estruturar a lógica de programação de maneira eficiente.</li>
</ol>

<h2>Funcionalidades</h2>

<ul>
    <li><strong>Entrada de Dados</strong>: O programa permite que o usuário insira um número inteiro.</li>
    <li><strong>Verificação de Paridade</strong>: O método <code>verificando</code> é utilizado para determinar se o número é par ou ímpar.</li>
    <li><strong>Saída de Resultados</strong>: O resultado da verificação é impresso na tela, informando ao usuário se o número digitado é par ou ímpar.</li>
</ul>

<h2>Conclusão</h2>

<p>Neste projeto, desenvolvemos uma aplicação em Java que verifica se um número digitado pelo usuário é par ou ímpar. Utilizando duas classes, o código promove uma abordagem modular e bem organizada, onde a classe <code>Main</code> se ocupa da interação com o usuário, enquanto a classe <code>verificador</code> contém a lógica de verificação. Essa estrutura demonstra como métodos podem ser usados para simplificar e organizar a programação, permitindo que o código seja facilmente mantido e reutilizado em projetos futuros.</p>
