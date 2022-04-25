public class Pessoa {

  private String nome;
  private String cpf;
  private String telefone;
  static boolean valido;

  public String getPessoas(){
    return "{ Nome: "+getNome()+", Cpf: "+getCpf()+", Telefone: "+getTelefone()+" } ";
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    if(validaCPF(cpf)){
      this.cpf = cpf;
    }else{
      this.cpf = "cpf invalido";
    }
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    if(validaNumero(telefone)){
      this.telefone = telefone;
    }else{
      this.telefone = "Telefone invalido";
    }
  }

  public static Boolean validaCPF(String cpf) {
    if (cpf.length() != 11) {
      return false;
    }
    int mult = 10;
    int total = 0;
    for (int i = 0; i <= 8; i++) {
      total += Character.getNumericValue(cpf.charAt(i)) * mult--;
    }
    int resultado = total % 11;
    int digito1 = resultado <= 2 ? 0 : 11 - resultado;
    if (digito1 != Character.getNumericValue(cpf.charAt(9))) {
      return false;
    }
    mult = 11;
    total = 0;
    for (int i = 0; i <= 9; i++) {
      total += Character.getNumericValue(cpf.charAt(i)) * mult--;
    }
    resultado = total % 11;
    int digito2 = resultado <= 2 ? 0 : 11 - resultado;
    if (digito2 != Character.getNumericValue(cpf.charAt(10))) {
      return false;
    }
    char oitavoNumero = cpf.charAt(8);
      estado(oitavoNumero);
    return true;
  }

  public static String estado(char oitavoDigito){
    if (oitavoDigito == '1') {
      return "Distrito Federal, Goiás, Mato Grosso do Sul e Tocantins";
    }
    else if (oitavoDigito == '2'){
      return "Pará, Amazonas, Acre, Amapá, Rondônia e Roraima";
    }
    else if (oitavoDigito == '3'){
      return "Ceará, Maranhão e Piauí";
    }
    else if (oitavoDigito == '4'){
      return "Pernambuco, Rio Grande do Norte, Paraíba e Alagoas";
    }
    else if (oitavoDigito == '5'){
      return "Bahia e Sergipe";
    }
    else if (oitavoDigito == '6'){
      return "Minas Gerais";
    }
    else if (oitavoDigito == '7'){
      return "Rio de Janeiro e Espírito Santo";
    }
    else if (oitavoDigito == '8'){
      return "São Paulo";
    }
    else if (oitavoDigito == '9'){
      return "Paraná e Santa Catarina";
    }
    else if (oitavoDigito == '0'){
      return "Rio Grande do Sul";
    }else{
      return "Cpf invalido";
    }
  }

  public static boolean validaNumero(String numero) {
    for (int i = 0; i < numero.length(); i++) {
      if (numero.charAt(i) != '0' && numero.charAt(i) != '1' && numero.charAt(i) != '2' && numero.charAt(i) != '3'
          &&
          numero.charAt(i) != '4' && numero.charAt(i) != '5' && numero.charAt(i) != '6'
          && numero.charAt(i) != '7' &&
          numero.charAt(i) != '8' && numero.charAt(i) != '9') {
        valido = true;

      } else {
        if (numero.charAt(2) != '9') {
          valido = true;
        }
      }
    }
    if (valido == true) {
      System.out.println("o numero nao e valido");
      return false;
    } else {
      return true;
    }
  }
}
