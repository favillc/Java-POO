import java.awt.*;//Import básico
class Escolha extends Frame { //declara a classe e pega a herança de Frame
    Escolha( ) { //Construtor
        super("Choice"); //Acessa o construtor da classe pai
        Choice choice = new Choice(); //Instância um objeto
        choice.addItem("Item 1"); //Adiciona um novo Item com label "Item 1"
        choice.addItem("Item 2"); //Adiciona um novo Item com label "Item 2"
        add(choice); //Adiciona choice no frame
        pack( ); //Dimensiona o frame para que todos os componentes estejam em seu tamanho padrão
        setVisible(true); //Torna o frame visível
    }
    static public void main(String[] args) { //Método principal onde o programa é executado
        new Escolha( );//Cria uma instância da classe Escolha
    }
}