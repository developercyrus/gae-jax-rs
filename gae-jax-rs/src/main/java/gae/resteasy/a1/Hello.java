package gae.resteasy.a1;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
