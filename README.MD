# Spring web chat application from local LLM - DeepSeek

## This is Spring web, Ollama, Lombok project

### Requirement

<p><b>Tools:</b> Python 3.8 or greater, Java 17 or greater, Ollama, Deepseek LLM</p>

<p><b>OS:</b> Windows, Mac or Linux</p>

### Software Tools

<p><b>Tools:</b> Python, Java, Spring, Lombok, Ollama, Deepseek LLM, Gradle</p>

### Setup

<ul>
    <li><a href="https://www.python.org/">Download and install Python</a></li>
    <li><a href="https://ollama.com/">Download and install Ollama</a></li>
    <li>Select your language model and run in from the terminal (in our case we use "ollama run deepseek-r1:7b" for DeepSeek model)</li>
    <li>If you run it for the first time it will install the LLM (test it, then close it with CTR+Z)</li>
    <li>Install Java (OpenJDK recommended, OracleJDK)</li>
    <li>Run the Spring application</li>
</ul>

> [!INFO]
> For Ubuntu base Linux you will have base Python 3 installed. Some additional package need to be installed like: pip, setuptools and gradio!

### Test LLM

<p><b>Model:</b> deepseek-r1:7b</p>

<p><b>All opensource models:</b> <a href="https://ollama.com/search">link</a></p>

### Spring configuration

```
spring.ai.ollama.chat.model=deepseek-r1:7b

server.port=5000
```

### End points

Method GET:

localhost:5000/chat?question=Ask your question

localhost:5000/info

localhost:5000/joke

```tree
├───main
    ├───java
    │   └───com
    │       └───martinatanasov
    │           └───local_llm
    │               ├───config
    │               └───controller
    └───resources
```