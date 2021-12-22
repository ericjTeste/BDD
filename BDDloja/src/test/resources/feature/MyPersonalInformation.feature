#language: pt
@funcionais

@tag
Funcionalidade: Alterar Minhas informacoes
   
 Contexto:
 
    Dada  que estou na tela de login da Loja Selenium
    
    E preencho os campos email "curso_teste_2@gmail.com" e senha"abc.123" 
    
    Quando aciono o botao Sign in
    
    Entao o sistem apresenta tela inicial com usuario Ramon Logado
    
    
    
  @tag1
  Cenario: Altear minhas informacoes
                  
    Dada que ja estou na tela de 'My Personal Information'
    E  altero todos os campos obrigatorios
    Quando aciono o botao Save
    Entao o sistema salva todos os dados alterado e apreenta mensagem de sucesso
    