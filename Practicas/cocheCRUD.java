package Practicas;

import java.util.List;

public interface cocheCRUD {



    void save(cocheCRUD crud);

    List<cocheCRUD> findAll();

    void delete (cocheCRUD crud);



}
