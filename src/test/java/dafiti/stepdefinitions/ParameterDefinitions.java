package dafiti.stepdefinitions;

import dafiti.model.InformationUser;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

public class ParameterDefinitions {

        @ParameterType(".*")
        public Actor actor (String actorName){
            return OnStage.theActorCalled(actorName);
        }
        @DataTableType
        public InformationUser informationUser (Map<String,String> data){
            InformationUser informationUser = new InformationUser();
            informationUser.setEmail(data.get("email"));
            informationUser.setPassword(data.get("password"));
            informationUser.setName(data.get("name"));
            informationUser.setLastName(data.get("lastName"));
            informationUser.setDocumentType(data.get("documentType"));
            informationUser.setId(data.get("id"));
            informationUser.setGender(data.get("gender"));
            informationUser.setBirtDate(data.get("birtDate"));
            return informationUser;
        }
}
