package com.function;

import com.microsoft.azure.functions.annotation.*;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.functions.*;

public class Function {

    @FunctionName("cosmosDBMonitor")
    public void cosmosDBProcessor(
            @CosmosDBTrigger(name = "Items", databaseName = "Test", containerName = "Tests", createLeaseContainerIfNotExists = true, connection = "AzureCosmosDBConnection") String items,
            final ExecutionContext context) throws JsonMappingException, JsonProcessingException {
        context.getLogger().info(items + "se realizo el siguiente registro en la base de datos");

                ObjectMapper mapper = new ObjectMapper();
                List<TestJson> testJsons = mapper.readValue(items, new TypeReference<List<TestJson>>() {});
                System.out.println(testJsons);

                TestJson testJson2 = testJsons.get(0);
                System.out.println("este id se inserto: " + testJson2.getId());
                System.out.println("este testid se inserto: " + testJson2.getTestid());

    }
}
