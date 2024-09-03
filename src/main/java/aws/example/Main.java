package aws.example;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Main {

    
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        String modelId = "anthropic.claude-3-sonnet-20240229-v1:0";
        String prompt = "Provide details about beluga. Provide a lot of details and format your answer in JSON format";
        BedrockHelper.analyzeIdWithTextract("/dummy_full_path_to_document");
        BedrockHelper.invokeModel(modelId, prompt);

        BedrockHelper.invokeModelWithStream(modelId, prompt);
        
        BedrockHelper.converseApi(modelId,"/dummy_full_path_to_document");
         
        BedrockHelper.invokeAgent("Some prompt",
                                 "some agent id",
                                 "some agent alias id",
                                 "some session id");
        
        BedrockHelper.documentInsight("/dummy_full_path_to_document", modelId, "Summarize the document");
        
        System.out.println("\n");
    }
}