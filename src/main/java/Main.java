import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo(a)! Precisamos de alguns dados para o seu cadastro em nossa empresa Farmaco % cia.");
        System.out.println("Qual seu primeiro nome?"); // 1
        String nome = sc.nextLine();
        System.out.println("E seu sobrenome?"); //2
        String sobrenome = sc.nextLine();
        System.out.println("Seja bem vindo(a), " + nome + "! Qual é sua idade?"); // 3
        int idade = sc.nextInt();
        System.out.println("E qual é o seu gênero? (Responder F para feminino ou M para masculino)"); // 4
        sc.nextLine();
        char letra = sc.nextLine().charAt(0);
        System.out.println("Qual o seu CPF? (Exemplo: 123.456.789-00)"); // 5
        String cpf = sc.nextLine();
        System.out.println("Você possui plano de saúde? Se sim, qual?"); // 6
        String planoSaude = sc.nextLine();
        System.out.println("Você é PCD? (Pessoa com deficiência). Responder com sim ou não."); // 7
        String respostaPCD = sc.nextLine();
        System.out.println("Você já possui o cartão fidelidade Farmaco & cia?"); // 8
        String cartao = sc.nextLine();
        System.out.println("Qual seu telefone? (Com DDD, sem espaço e sem travessão)"); // 9
        String telefone = sc.nextLine();
        System.out.println("Como conheceu a Farmaco & cia?"); // 10
        String conhecer = sc.nextLine();
        System.out.println("Muito obrigado! Seu cadastro está concluído.");


        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + letra);
        System.out.println("CPF: " + cpf);
        System.out.println("Possui plano de saúde? " + planoSaude);
        System.out.println("É PCD? " + respostaPCD);
        System.out.println("Possui cartão de fidelidade? " + cartao);
        System.out.println("Telefone: " + telefone);
        System.out.println("Como conheceu a empresa? " + conhecer);

    }
}

