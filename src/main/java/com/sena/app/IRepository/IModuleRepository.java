package com.sena.app.IRepository;
import com.sena.app.Entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IModuleRepository extends JpaRepository<Module, Long> {
}

