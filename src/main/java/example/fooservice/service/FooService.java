package example.fooservice.service;

import example.fooservice.domain.Foo;
import example.fooservice.repository.FooRepository;
import org.springframework.stereotype.Service;

@Service
public class FooService {
    private final FooRepository fooRepository;

    public FooService(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    public Foo getFoo() {
        return new Foo("Foo #" + fooRepository.nextFoo());
    }
}
