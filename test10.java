class ThrowInFinally {
    @Test
    void test_1() {
        try {
        } finally {
            throw new RuntimeException();
            return;
        }
    }
	
    @Test
    void test2_dsf_sdf() {
        throw new RuntimeException();
    }
}
