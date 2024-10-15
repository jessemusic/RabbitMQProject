package dtos;

public class StudentDTO {

    private Integer id;
    private String name;
    private String curso;

    public StudentDTO() {
    }

    public StudentDTO(Integer id, String name, String curso) {
        this.id = id;
        this.name = name;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
