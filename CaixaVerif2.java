import java.awt.*;//Import básico
class CaixaVerif2 extends Frame { //declara a classe e pega a herança de Frame
    Checkbox cb1 = new Checkbox("Verificação UM"); //Instância um componente para a checkbox
    Checkbox cb2 = new Checkbox("Verificação DOIS"); //Instância um componente para a checkbox
    CaixaVerif2( ) { //Construtor
        super("Checkbox");//Acessa o construtor da classe pai
        setLayout(new GridLayout(2, 1));//Configura o layout como um gridlayout de 2x1
        add(cb1);//Adiciona cb1 ao frame
        add(cb2);//Adiciona cb2 ao frame
        pack( ); //Dimensiona o frame para que todos os componentes estejam em seu tamanho padrão
        setVisible(true); //Torna o frame visível
    }
    static public void main(String[] args) { //Método principal para execução
        new CaixaVerif2( );//Instância da classe CaixaVerif2
    }
}