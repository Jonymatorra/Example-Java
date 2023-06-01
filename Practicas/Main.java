package Practicas;

import java.util.List;

public class Main {

    static cocheCRUD crud = new cocheCRUD();





        public static void main(String[] args) {

            crud.findAll();
            crud.save(new cocheCRUD() {
                @Override
                public void save(cocheCRUD crud) {

                }

                @Override
                public List<cocheCRUD> findAll() {
                    return null;
                }

                @Override
                public void delete(cocheCRUD crud) {

                }
            });
            crud.delete();









        }




}
