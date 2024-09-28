



Select * from (Select * from cliente where Estado_codigo = SP)
    inner join cliente_Telefone 
    on (cliente.cpf = cliente_Telefone.cpf)