public class Main {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Filipe Queiroz");
        pessoaFisica.setEndereco("Rua São Jorge");
        pessoaFisica.setCpf("123.456.789-10");
        pessoaFisica.setDataNascimento("01/01/2000");
        System.out.println("\n***** PESSOA FÍSICA *****");
        System.out.println("NOME: " + pessoaFisica.getNome() + "\nENDERECO: " + pessoaFisica.getEndereco() + "\nCPF: " + pessoaFisica.getCpf() + "\nDATA DE NASCIMENTO: " + pessoaFisica.getDataNascimento());

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Filipe Queiroz EIRELI");
        pessoaJuridica.setEndereco("Rua Mafagafos Mafagafinhos");
        pessoaJuridica.setCnpj("12.345.678/0009-10");
        pessoaJuridica.setSetorAtuacao("Tecnologia");
        System.out.println("\n***** PESSOA JURÍDICA *****");
        System.out.println("NOME: " + pessoaJuridica.getNome() + "\nENDERECO: " + pessoaJuridica.getEndereco() + "\nCNPJ: " + pessoaJuridica.getCnpj() + "\nSETOR DE ATUAÇÃO: " + pessoaJuridica.getSetorAtuacao());

    }
}