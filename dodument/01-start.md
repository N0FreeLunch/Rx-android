
RxJava version 2
```
import io.reactivex.Observable;
```

Rxjava version 3
```
import io.reactivex.rxjava3.core.observable
```

```
public void emit() {
    Observable.just("Hello", "RxJava 2!!")
            .subscribe(System.out::println);
}
```

emit 메서드에서

System.out::println 함수를 전달하면 이 함수에 just로 전달한 인자를 전달한다.

System.out::println는 안드로이드에서 지원하지 않기 때문에

run FirstExample with Coverage를 실행한다.

run FirstExample with Coverage 프로젝트 단위가 아닌 태스트 모듈 단위로 실행할 수 있게 한다.
