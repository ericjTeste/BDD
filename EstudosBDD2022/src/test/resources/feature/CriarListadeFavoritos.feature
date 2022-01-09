#language: pt
@funcionais


@tag
Funcionalidade: Preencher Lista com xpath
   
 Contexto:
 
    Dada  que estou na tela de Listar
    


@tag1
Cenario: Alterar Row1
                  
    
    Quando aciono o botao 'edicao' da tela
    
    Entao o sistem abilita o campo para edicao 
    
    E eu edito o campo e aciono o botao 'Save'
    
    E o sistema me apresenta mensagem de sucesso
    

@tag2
Cenario: Adionar novo Row
                 
    Quando aciono o botao 'Add' da tela
    
    Entao o sistem abilita o campo para adcioana novo Row 
    
    E eu aciono o botao 'Edit'
    
    E preencho o campo e aciono o botao 'Save'
    
    E o sistema apresenta mensagem de sucesso

    
@tag3
Cenario: Remover novo Row
                 
    Quando aciono o botao 'Add' da tela
    
    Entao o sistem abilita o campo para adcioana novo Row 
    
    E eu aciono o botao 'Edit'
    
    E preencho o campo e aciono o botao 'Save'
    
    E o sistema apresenta mensagem de sucesso
    
    E aciono o botao de 'Remove'
    
    E sistema mostra mensagem de sucesso   

