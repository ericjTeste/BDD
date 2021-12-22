#language: pt
@funcionais

@tag
Funcionalidade: Fazer login 
   
 Contexto:
 
    Dada  que estou na tela de login da Loja Selenium
    
    E preencho os campos email "curso_teste_2@gmail.com" e senha"abc.123" 
    
    Quando aciono o botao Sign in

 
  @tag1
  Cenario: Fazer login 
                  
    Entao o sistem apresenta tela inicial com usuario Ramon Logado
    