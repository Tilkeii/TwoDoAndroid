package twodo.twodo.dto.api;

public interface ApiListener<T> {

    void onSuccess(T response);

    void onError(Throwable throwable);
}
