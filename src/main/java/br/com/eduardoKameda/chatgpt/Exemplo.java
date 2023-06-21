package br.com.eduardoKameda.chatgpt;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;

public class Exemplo {
	
	private static final String API_KEY = "SECRET-KEY"; // Esta SECRET-KEY terá que ser gerada no site da Openai.com
														//https://platform.openai.com/account/api-keys

    public static void main(String[] args) {
    	
        OpenAiService service = new OpenAiService(API_KEY);

        CompletionRequest request = CompletionRequest.builder()
                .model("text-davinci-003")
                .prompt("Escreva 20 frases  para meu cachorro ficar mais feliz.")
                .maxTokens(600)
				.frequencyPenalty(0.0)
				.temperature(0.3)
                .build();

        System.out.println(service.createCompletion(request).getChoices());
         
    }

}