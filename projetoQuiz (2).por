programa {
  funcao inicio() {
    //variaveis
    inteiro respoC,respE
    real porc
    caracter resp,op

    //atribuindo escolhas
    escreva("Bem vindo ao quiz:Reino Animal\n")
    escreva("escolha sua dificuldade\n")
    escreva("facil\n")
    escreva("medio\n")
    escreva("dificil\n")
    leia(op)

    escolha(op){
      caso "facil":
        para(inteiro i = 0; i < 9;i++){
        se(i == 0){
          escreva("Iniciando dificuldade f�cil")
          escreva("1. Qual o maior mamifero terrestre?\n")
          escreva("a) Rinocerante-Branco\n")
          escreva("b) Elefante-Africano\n")
          escreva("c) Hipop�tomo\n")
          escreva("d) Girafa\n")
          escreva("e) Le�o\n")
          escreva("Qual a altenatica certa?\n")
          leia(resp)
          enquanto(resp == "a" e resp == "b" e resp == "c" e resp == "d" e resp == "e"){
            escreva("digite alguma das alternativas!")
            leia(resp)
          }

          se(resp == "b"){
            escreva("resposta certa")
            respC++
          }senao{
            escreva("Resposta errada")
            respE++
          }
          
      } 
      escreva("\n\n")
        se(i == 1){
          escreva("2. Qual animal � conhecido por ter a mordida mais forte em compara��o ao seu tamanho corporal?\n")
          escreva("a)le�o\n")
          escreva("tubar�o-branco\n")
        }     
    }
    }
  }
}
