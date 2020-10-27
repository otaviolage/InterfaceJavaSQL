# InterfaceJavaSQL

<h1 align= "center">CADASTRO DE CLIENTES (JAVA)</h1>
<p align= "center"><i>Sistema de Cadastro em Java usando JFRAME, POO e MYSQL.</p></i>



- [ ] Interface Gráfica
- [ ] Cadastro de Usuário
- [ ] Funcionalidade dos Botões
- [ ] Conexão com o Banco de Dados
- [ ] Busca de clientes ou produtos 
<h1 align= "center">Demostração do programa</h1>

### Tela de carregamento

[<img align="left" src="https://raw.githubusercontent.com/matheusoliveira3/CadastroClientesAPP/main/images/Tela%20de%20carregamento%20pequena.png" />](https://raw.githubusercontent.com/matheusoliveira3/CadastroClientesAPP/main/images/Tela%20de%20carregamento.png) [Tela de carregamento](https://raw.githubusercontent.com/matheusoliveira3/CadastroClientesAPP/main/images/Tela%20de%20carregamento.png) 
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

### Tela de menu

[<img align="left" src="https://raw.githubusercontent.com/matheusoliveira3/CadastroClientesAPP/main/images/Tela%20de%20menu%20pequena.png" />](https://raw.githubusercontent.com/matheusoliveira3/CadastroClientesAPP/main/images/Tela%20de%20menu.png) [Tela de menu](https://raw.githubusercontent.com/matheusoliveira3/CadastroClientesAPP/main/images/Tela%20de%20menu.png) 
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

### Tela de cadastro de clientes

[<img align="left" src="https://raw.githubusercontent.com/matheusoliveira3/CadastroClientesAPP/main/images/Tela%20de%20cadastro%20de%20clientes%20pequena.png" />](https://raw.githubusercontent.com/matheusoliveira3/CadastroClientesAPP/main/images/Tela%20de%20cadastro%20de%20clientes.png) [Tela de cadastro de clientes](https://raw.githubusercontent.com/matheusoliveira3/CadastroClientesAPP/main/images/Tela%20de%20cadastro%20de%20clientes.png) 
<br/>
<br/>
<br/>
<br/>
<br/>

### Tela de cadastro de produtos

[<img align="left" src="https://raw.githubusercontent.com/matheusoliveira3/CadastroClientesAPP/main/images/Tela%20de%20cadastro%20de%20produtos%20pequena.png" />](https://raw.githubusercontent.com/matheusoliveira3/CadastroClientesAPP/main/images/Tela%20de%20cadastro%20de%20produtos.png) [Tela de cadastro de produtos](https://raw.githubusercontent.com/matheusoliveira3/CadastroClientesAPP/main/images/Tela%20de%20cadastro%20de%20produtos.png) 
<br/>
<br/>
<br/>
<br/>
<br/>

### Banco de Dados no MySQL, criado com os códigos abaixo:

```sql

create table cadastroclientes (
	id			int					auto_increment primary key,
    nome		varchar(30)			not null,
    cpf			varchar(30),
    sexo		varchar(15),
    endereco	varchar(120),
    cidade		varchar(60),
    estado		varchar(30) 
);

create table cadastroprodutos (
	id 			int 				auto_increment primary key,
    categoria 	varchar(30),
    nome		varchar(60),
    estoque		int					default 0,
    custo		decimal(8,2),
    preco		decimal(8,2)
);

```
