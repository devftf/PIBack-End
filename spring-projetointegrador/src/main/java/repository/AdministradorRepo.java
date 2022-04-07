package repository;

public interface AdministradorRepo extends CrudRepository<Administrador, Integer>{
    @Query(value="select CASE WHEN count(1) > 0 'true' ELSE 'false' END from admistradores where id = :id", nativeQuery = true)
    public boolean exist(int id);

    @Query(value="select * from administradores where email = :email and senha =senha", nativeQuery = true)
    public Administrador Login(String email, String senha);

}
