package student.springframework.springrestclientexamples.api.domain;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@Generated("jsonschema2pojo")
public class Job implements Serializable {

    private String title;
    private String company;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
