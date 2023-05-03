package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ConsultaCEP {

public static final int TIMEOUT = 300;

/**
 *
 * ConsultaCEP
 *
 * @author Rafael Juan Cardoso Martins
 * @since 03/05/2023, 16:50:21
 *
 */
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var CEP = Var.VAR_NULL;
   private Var Json = Var.VAR_NULL;

   public Var call() throws Exception {
    CEP =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Endereco.active.ceP"));
    Json =
    cronapi.json.Operations.toJson(
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("GET"),
    Var.valueOf("application/x-www-form-urlencoded"),
    Var.valueOf(
    Var.valueOf("https://viacep.com.br/ws/").getObjectAsString() +
    CEP.getObjectAsString() +
    Var.valueOf("/json/").getObjectAsString()), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL,
    Var.valueOf(""),
    Var.valueOf("BODY")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("Endereco.active.bairro"),
    cronapi.json.Operations.getJsonOrMapField(Json,
    Var.valueOf("bairro")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("Endereco.active.logradouro"),
    cronapi.json.Operations.getJsonOrMapField(Json,
    Var.valueOf("logradouro")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("Endereco.active.uf"),
    cronapi.json.Operations.getJsonOrMapField(Json,
    Var.valueOf("uf")));
    return Var.VAR_NULL;
   }
 }.call();
}

}

