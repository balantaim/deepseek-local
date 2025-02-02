# Spring web chat application for local LLM - DeepSeek

## This is Spring web, AI Ollama, Lombok project

### Requirement

<p><b>Tools:</b> Python 3.8 or greater, Java17 or greater, Ollama, Deepseek LLM</p>

<p><b>Supported OS:</b> Windows, Mac, Linux</p>

### Software Tools

<p><b>Tools:</b> Python, Java, Spring, Lombok, Ollama, Deepseek LLM, Gradle</p>

### Setup

<ul>
    <li>Install Python</li>
    <li>Install Ollama</li>
    <li>Select your language model and run in from the terminal (in our case se use "ollama run deepseek-r1:7b" for DeepSeek LLM)</li>
    <li>If you run it for the first time it will install the LLM (after you test the chat you could close it with CTR+Z)</li>
    <li>Install Java</li>
    <li>Run the Spring application</li>
</ul>

<p>For Ubuntu base Linux you will have base Python3 installed. You need to install additional package like: pip, setuptools and gradio</p>

### Test language model

deepseek-r1:7b

### End points

localhost:5000/chat?question=Ask your question

localhost:5000/info

localhost:5000/joke