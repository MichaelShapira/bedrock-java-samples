package aws.example;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Main {

    
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        String modelId = "anthropic.claude-3-haiku-20240307-v1:0";
        String prompt = "Write a poem about Harry Poter";
        
        /*
        System.out.println("\n\n");
        BedrockHelper.queryKnowledgeBase("XXXXXXXXX",  
                                         "Tell me the story of Captain Ahab?",
                                         "arn:aws:bedrock:us-east-1::foundation-model/anthropic.claude-3-haiku-20240307-v1:0");
        
        BedrockHelper.invokeModel(modelId, prompt);
        
        BedrockHelper.invokeModelWithStream(modelId, prompt);
        
        BedrockHelper.converseApi(modelId,"/dummy_full_path_to_image");

        BedrockHelper.invokeAgent("Some prompt",
                                 "some agent id",
                                 "some agent alias id",
                                 "some session id");
        
        BedrockHelper.documentInsight("/dummy_full_path_to_document", modelId, "Summarize the document");
        
        BedrockHelper.useTool( prompt);
        */
        System.out.println("\n");
    }
}