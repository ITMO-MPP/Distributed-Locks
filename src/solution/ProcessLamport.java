package solution;

import internal.Environment;

/**
 * Distributed mutual exclusion implementation.
 * All functions are called from the single main thread.
 *
 * @author <First-Name> <Last-Name> // todo: replace with your name
 */
public class ProcessLamport implements MutexProcess {
    private final Environment env;

    public ProcessLamport(Environment env) {
        this.env = env;
    }

    @Override
    public void onMessage(int sourcePid, Object message) {
        throw new UnsupportedOperationException("Not implemented"); // todo: write your code here
    }

    @Override
    public void onLockRequest() {
        throw new UnsupportedOperationException("Not implemented"); // todo: write your code here
    }

    @Override
    public void onUnlockRequest() {
        throw new UnsupportedOperationException("Not implemented"); // todo: write your code here
    }
}
