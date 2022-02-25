package stepsdefinitions;

import core.BaseTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import utils.Credentials;

public class StepByDefinitions extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Dado("que eu estou com acesso a api de cadastro")
    public void que_eu_estou_com_acesso_a_api_de_cadastro() {
        setupBodyRequest("{\"nome\":\"hugo\",\"idade\":20,\"id\":193311}");
        //setupBodyRequest(cenario1);
    }

    @Quando("envio informacoes validas para o cadastro de uma pessoa")
    public void envio_informacoes_validas_para_o_cadastro_de_uma_pessoa() {
        sendPost("/cliente");
    }

    @Entao("devo visualizar o status de criado com sucesso")
    public void devo_visualizar_o_status_de_criado_com_sucesso() {
        Assert.assertEquals(201, getResponse().getStatusCode());
    }

    @Dado("que estou com acesso a api de cadastro")
    public void que_estou_com_acesso_a_api_de_cadastro() {
    setupBodyRequest("{\"nome\": \"val\",\"idade\":1q2w3e4r,\"id\":\"852\",\"risco\":1}");

    }

    @Quando("envio informacoes invalidas para cadastrar uma pessoa")
    public void envio_informacoes_invalidas_para_cadastrar_uma_pessoa() {
sendPost("/cliente");
    }

    @Entao("devo visualizar o status requisicao mal sucedida")
    public void devo_visualizar_o_status_requisicao_mal_sucedida() {
        Assert.assertEquals(400, getResponse().getStatusCode());
    }

}