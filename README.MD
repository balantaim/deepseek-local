# Spring web chat application from local LLM - DeepSeek

![SEO Optimisations](images/spring-ai.svg)

<hr>

![SEO Optimisations](images/deepseek.png)

<hr>

## Requirements

<p><b>Tools:</b> Python 3.8 or greater, Java 17 or greater, Ollama, Deepseek LLM</p>

<p><b>OS:</b> Windows, Mac or Linux</p>

### Software Tools

<p><b>Tools:</b> Python, Java, Spring, Lombok, Gradle, Ollama, Deepseek LLM</p>

### Setup

<ol>
    <li><a href="https://www.python.org/">Download and install Python</a></li>
    <li><a href="https://ollama.com/">Download and install Ollama</a></li>
    <li><a href="https://ollama.com/search">Select your language model</a> and run in from the terminal (in our case we use "<i>ollama run deepseek-r1:7b</i>" for DeepSeek model)</li>
    <li>If you run it for the first time it will install the LLM (test it, then close it with CTR+Z)</li>
    <li>Install Java (OpenJDK recommended, OracleJDK)</li>
    <li>Run the Spring application</li>
</ol>

> [!IMPORTANT]
> For Ubuntu base Linux you will have base Python 3 installed. Some additional package need to be installed like: pip, setuptools and gradio!

### Spring configuration

```
spring.ai.ollama.chat.model=deepseek-r1:7b

server.port=5000
```

### Test LLM

<p><b>Model:</b> deepseek-r1:7b</p>

<p><b>All opensource models:</b> <a href="https://ollama.com/search">link</a></p>

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