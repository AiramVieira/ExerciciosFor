    //operadores fodelões
    int numero = 0;
    numero = numero + 1;
    numero += 1;
    numero++;

    int numero = 9;
    numero = numero -1;
    numero -= -1;
    numero--;

    int numero = 4;
    numero = numero * 2;
    numero *= 2;

    int numero = 12;
    numero = numero / 2;
    numero /= 2;

    int numero = 3;
    numero = numero %2;
    numero %= 2;



    //if padrão
    String nome = "";
    int idade = 10;

    if(idade <= 12){
      nome="Criança";
    }else{
      nome = "Adulto";
    }

    //maneira reduzida (Operador Ternário)
    int idade = 10;
    String nome = idade<=10?"Criança":"Adulto";
      System.out.println(idade<=12?"Criança":"Adulto");

    //if padrão com else if
      int idade = ?
      if(idade<12){
        System.out.println("Criança");
      }else if(idade<18){
        System.out.println("Adolescente");
      }else if(idade < 60){
        System.out.println("Adulto");
      }else{
        System.out.println("Idoso");  
      }
    //Operador ternário com varios else if
    int idade = ?;
    System.out.println(idade < 12 ?"Criança"
                      :idade < 18 ?"Adolescente"
                      :idade < 60 ?"Adulto"
                      :"Idoso"};