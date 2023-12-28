package Lesson7_Homework;

    import java.util.List;
    public class Response<T>{
        private List<T> data;
        private Pagination pagination;


        public Response() {
            this.data = data;
            this.pagination = pagination;
        }

        public List<T> getData() {
            return data;
        }

        public void setData(List<T> data) {
            this.data = data;
        }

        public Pagination getPagination() {
            return pagination;
        }

        public void setPagination(Pagination pagination) {
            this.pagination = pagination;
        }


        @Override
        public String toString() {
            return "Data: " + this.data + ", Pagination: " + this.pagination;
        }

        // Pagination
        public static class Pagination {
            private int limit;
            private int offset;
            private int total;

            public Pagination(int limit, int offset, int total) {
                this.limit = limit;
                this.offset = offset;
                this.total = total;
            }

            public int getLimit() {
                return limit;
            }

            public void setLimit(int limit) {
                this.limit = limit;
            }

            public int getOffset() {
                return offset;
            }

            public void setOffset(int offset) {
                this.offset = offset;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }
            @Override
            public String toString() {
                return "Limit: " + this.limit + ", Offset: " + this.offset + ", Total: " + this.total;
            }
        }
    }

