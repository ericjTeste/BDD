#language: pt
@funcionais


@tag
Funcionalidade: Preencher os campo para Fazer login com xpath
   
 Contexto:
 
    Dada  que estou na tela de login da Loja Selenium
    
    E preencho os campo Username "student" e Password "Password123"  	 
    
    Quando aciono o botao Submit
    
    Entao o sistem apresenta tela inicial 


@tag1
Cenario: Login com sucesso
                  
    E deve ser apresentado mensagem de sucesso
    

@tag2
Cenario: Login com log out
                 
    E usuario aciona botao 'Log Out' e usuario e direcionado para tela de Login
    
    
    

