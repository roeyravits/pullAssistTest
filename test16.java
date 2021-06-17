class ThrowInFinally {

    @Transactional
    void test_1() {
        try {
        } finally {
            throw new RuntimeException();
            return;
        }
    }
	
}
