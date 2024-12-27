import java.util.concurrent.ThreadLocalRandom; // Importa a classe ThreadLocalRandom para gerar números aleatórios

public class selecaoCandidatos {
    public static void main(String[] args) {
        
        selecaoCandidatos(); // Chama o método que realiza a seleção dos candidatos
        imprimirSelecionados(); // Chama o método que imprime os candidatos selecionados
    }

    // Método que imprime a lista de candidatos selecionados
    static void imprimirSelecionados(){
        String [] candidatos = {"Alice", "Bruno", "Carla", "Daniel", "Eduarda"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada e interação com o for each");

        for (String candidato : candidatos){
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

    // Método que realiza a seleção dos candidatos
    static void selecaoCandidatos(){  
        String[] candidatos = {"Alice", "Bruno", "Carla", "Daniel", "Eduarda", "Fabio", "Gabriela", "Henrique", "Isabela", "João", "Karina", "Leonardo", "Mariana", "Nicolas", "Olivia"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        // Loop para selecionar 5 candidatos
        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            
            if(salarioBase >= salarioPretendido){
                System.out.println("Ligar para o candidato " + candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    // Método que retorna um valor de salário pretendido aleatório
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Método que analisa se o candidato deve ser contatado com base no salário pretendido
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
