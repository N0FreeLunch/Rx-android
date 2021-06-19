import io.reactivex.Observable;

public class Example02 {
    public void emit() {
        Observable.just(1,2,3,4,5,6)
                .subscribe(System.out::println);
    }
}
