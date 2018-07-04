package per.chc.spring.springCloudNetflixServicioRestPrivado;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ServicioAuxiliar {
    @Value("{rest.service.config.auxiliar}")
    String valueAuxiliar = null;
    private static org.slf4j.Logger log =LoggerFactory.getLogger(ServicioAuxiliar.class);
    @RequestMapping(value = "/auxiliar")
    public String auxiliar(){
        String result = "{Empty value}";

        if (valueAuxiliar.equals(null)) {

            log.error("PublicRestService - El error es devido a que en el application property rest.service.cloud.config.auxiliar esta vacia");
        }else{
            log.info("PublicRestService - En el property :(rest.service.cloud.config.auxiliar:" + valueAuxiliar+")");
            result = this.valueAuxiliar;

        }
        return result;
    }
}
