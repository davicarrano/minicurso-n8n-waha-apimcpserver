# 🚀 Minicurso Chatbots com IA: Integre WhatsApp, n8n, DeepSeek e APIs para atendimento autônomo e personalizado
> Neste projeto, será criado um chatbot que irá integrar o whatsapp a um Agente de Inteligência Artificial, por meio da API Waha (API do whatsapp) e do n8n (ferramenta de automação). 
O chatbot responderá com base não somente em todo o conhecimento do modelo de inteligência artificial que estiver sendo usado (neste projeto urilizaremos o DeepSeek), mas também com base nas informações disponibilizadas por uma API configurada como MCP Server (API Springboot configurada com o protocolo Model Context Protocol).
O Agente de IA será capaz de utilizar as funcionalidades disponibilizadas por este MCP Server, como consulta, criação e remoção de alunos de uma faculdade. Os dados desta API foram gerados aleatoriamente e estão em um banco de dados em memória na própria API.

---

### 📋 Pré-requisitos configurados na máquina
- [Java17](https://dev.to/alexjesustech/como-intalar-o-java-jdk-17-no-ubuntu-2204-19cm)
- [Docker](https://www.docker.com) 
- [docker-compose](https://docs.docker.com/compose/install/linux) 

---

## ✨ Artefatos Produzidos

- 🗂️ Api Springboot - api-mcp-faculdade
- 🗂️ Stack de aplicações conteinerizadas - docker-compose.yml

---

## 🖥️ Como baixar o projeto
No terminal, executar o comando abaixo:Java17
```bash

git clone https://github.com/davicarrano/minicurso-n8n-waha-apimcpserver.git

```
---


## 📡 Como gerar a imagem docker da API e registrar no dockerhub (somente será necessário esse passo se quiser alterar a API de exemplo)
Dentro da pasta do projeto springboot, executar o comando abaixo para gerar a imagem:
```bash

docker build -t NOME_DA_IMAGEM .

```
Neste projeto específico, eu criei a imagem para ser publicada no meu repositório do dockerhub (https://hub.docker.com/r/davicarrano/api-mcp-faculdade).

Para publicar a imagem no repositório, execute o comando abaixo
```bash

docker push NOME_DA_IMAGEM

```
---

### 🖥️ Rodando localmente a stack de aplicações

O docker-compose contempla 3 aplicações: waha (API do whatsapp), n8n (ferramenta de automação) e api-mcp-faculdade (API de exemplo com funcionalidades relacionadas a dados de alunos).
Com o projeto baixado e o docker-compose configurado, execute o comando abaixo para subir a stack das aplicações:

```bash
docker compose -f docker-compose.yaml up -d

```

Verifique se os containers subiram sem problema, rodando o comando a seguir:
```bash
docker ps
```
OBS: deve ser apresentada uma saída contendo uma linha para cada um dos 3 container, com algumas informações como nome, status, porta, etc...
---


### 📊 Carregando a interface da API Waha

Abra o browser e carregue o endereço **http://localhost:3000/dashboard**.

### 📊 Carregando a aplicação n8n

Abra o browser e carregue o endereço **http://localhost:5678**.


### 🖥️ Manual para configurar o waha e o n8n
Link: https://github.com/davicarrano/minicurso-n8n-waha-apimcpserver/blob/main/docs/manual-configura%C3%A7%C3%A3o-waha-n8n-deepseek.pdf

## 📞 Contato

- 👨‍💻 **Autor:** Davi Carrano
- 📧 Email: [davi@ufsj.edu.br](mailto:davi@ufsj.edu.br)  
- 🐙 GitHub: [github.com/davicarrano](https://github.com/davicarrano)  
