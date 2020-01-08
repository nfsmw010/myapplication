package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Weather implements Serializable {

    /**
     * success : true
     * result : {"resource_id":"F-C0032-001","fields":[{"id":"datasetDescription","type":"String"},{"id":"locationName","type":"String"},{"id":"parameterName","type":"String"},{"id":"parameterValue","type":"String"},{"id":"parameterUnit","type":"String"},{"id":"startTime","type":"Timestamp"},{"id":"endTime","type":"Timestamp"}]}
     * records : {"datasetDescription":"三十六小時天氣預報","location":[{"locationName":"臺北市","weatherElement":[{"elementName":"Wx","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"多雲時晴","parameterValue":"3"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"多雲短暫雨","parameterValue":"8"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"陰時多雲短暫雨","parameterValue":"10"}}]},{"elementName":"PoP","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"0","parameterUnit":"百分比"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"40","parameterUnit":"百分比"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"50","parameterUnit":"百分比"}}]},{"elementName":"MinT","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"21","parameterUnit":"C"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"18","parameterUnit":"C"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"16","parameterUnit":"C"}}]},{"elementName":"CI","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"舒適"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"稍有寒意至舒適"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"稍有寒意"}}]},{"elementName":"MaxT","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"25","parameterUnit":"C"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"21","parameterUnit":"C"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"18","parameterUnit":"C"}}]}]}]}
     */

    @SerializedName("success")
    private String success;

    @SerializedName("result")
    private ResultBean result;

    @SerializedName("records")
    private RecordsBean records;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public RecordsBean getRecords() {
        return records;
    }

    public void setRecords(RecordsBean records) {
        this.records = records;
    }

    public static class ResultBean implements Serializable {
        /**
         * resource_id : F-C0032-001
         * fields : [{"id":"datasetDescription","type":"String"},{"id":"locationName","type":"String"},{"id":"parameterName","type":"String"},{"id":"parameterValue","type":"String"},{"id":"parameterUnit","type":"String"},{"id":"startTime","type":"Timestamp"},{"id":"endTime","type":"Timestamp"}]
         */

        @SerializedName("resource_id")
        private String resource_id;

        @SerializedName("fields")
        private List<FieldsBean> fields;

        public String getResource_id() {
            return resource_id;
        }

        public void setResource_id(String resource_id) {
            this.resource_id = resource_id;
        }

        public List<FieldsBean> getFields() {
            return fields;
        }

        public void setFields(List<FieldsBean> fields) {
            this.fields = fields;
        }

        public static class FieldsBean implements Serializable {
            /**
             * id : datasetDescription
             * type : String
             */

            @SerializedName("id")
            private String id;

            @SerializedName("type")
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }

    public static class RecordsBean implements Serializable {
        /**
         * datasetDescription : 三十六小時天氣預報
         * location : [{"locationName":"臺北市","weatherElement":[{"elementName":"Wx","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"多雲時晴","parameterValue":"3"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"多雲短暫雨","parameterValue":"8"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"陰時多雲短暫雨","parameterValue":"10"}}]},{"elementName":"PoP","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"0","parameterUnit":"百分比"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"40","parameterUnit":"百分比"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"50","parameterUnit":"百分比"}}]},{"elementName":"MinT","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"21","parameterUnit":"C"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"18","parameterUnit":"C"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"16","parameterUnit":"C"}}]},{"elementName":"CI","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"舒適"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"稍有寒意至舒適"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"稍有寒意"}}]},{"elementName":"MaxT","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"25","parameterUnit":"C"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"21","parameterUnit":"C"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"18","parameterUnit":"C"}}]}]}]
         */

        @SerializedName("datasetDescription")
        private String datasetDescription;

        @SerializedName("location")
        private List<LocationBean> location;

        public String getDatasetDescription() {
            return datasetDescription;
        }

        public void setDatasetDescription(String datasetDescription) {
            this.datasetDescription = datasetDescription;
        }

        public List<LocationBean> getLocation() {
            return location;
        }

        public void setLocation(List<LocationBean> location) {
            this.location = location;
        }

        public static class LocationBean implements Serializable {
            /**
             * locationName : 臺北市
             * weatherElement : [{"elementName":"Wx","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"多雲時晴","parameterValue":"3"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"多雲短暫雨","parameterValue":"8"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"陰時多雲短暫雨","parameterValue":"10"}}]},{"elementName":"PoP","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"0","parameterUnit":"百分比"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"40","parameterUnit":"百分比"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"50","parameterUnit":"百分比"}}]},{"elementName":"MinT","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"21","parameterUnit":"C"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"18","parameterUnit":"C"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"16","parameterUnit":"C"}}]},{"elementName":"CI","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"舒適"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"稍有寒意至舒適"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"稍有寒意"}}]},{"elementName":"MaxT","time":[{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"25","parameterUnit":"C"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"21","parameterUnit":"C"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"18","parameterUnit":"C"}}]}]
             */

            @SerializedName("locationName")
            private String locationName;

            @SerializedName("weatherElement")
            private List<WeatherElementBean> weatherElement;

            public String getLocationName() {
                return locationName;
            }

            public void setLocationName(String locationName) {
                this.locationName = locationName;
            }

            public List<WeatherElementBean> getWeatherElement() {
                return weatherElement;
            }

            public void setWeatherElement(List<WeatherElementBean> weatherElement) {
                this.weatherElement = weatherElement;
            }

            public static class WeatherElementBean implements Serializable {
                /**
                 * elementName : Wx
                 * time : [{"startTime":"2020-01-07 12:00:00","endTime":"2020-01-07 18:00:00","parameter":{"parameterName":"多雲時晴","parameterValue":"3"}},{"startTime":"2020-01-07 18:00:00","endTime":"2020-01-08 06:00:00","parameter":{"parameterName":"多雲短暫雨","parameterValue":"8"}},{"startTime":"2020-01-08 06:00:00","endTime":"2020-01-08 18:00:00","parameter":{"parameterName":"陰時多雲短暫雨","parameterValue":"10"}}]
                 */

                @SerializedName("elementName")
                private String elementName;

                @SerializedName("time")
                private List<TimeBean> time;

                public String getElementName() {
                    return elementName;
                }

                public void setElementName(String elementName) {
                    this.elementName = elementName;
                }

                public List<TimeBean> getTime() {
                    return time;
                }

                public void setTime(List<TimeBean> time) {
                    this.time = time;
                }

                public static class TimeBean implements Serializable {
                    /**
                     * startTime : 2020-01-07 12:00:00
                     * endTime : 2020-01-07 18:00:00
                     * parameter : {"parameterName":"多雲時晴","parameterValue":"3"}
                     */

                    @SerializedName("startTime")
                    private String startTime;

                    @SerializedName("endTime")
                    private String endTime;

                    @SerializedName("parameter")
                    private ParameterBean parameter;

                    public String getStartTime() {
                        return startTime;
                    }

                    public void setStartTime(String startTime) {
                        this.startTime = startTime;
                    }

                    public String getEndTime() {
                        return endTime;
                    }

                    public void setEndTime(String endTime) {
                        this.endTime = endTime;
                    }

                    public ParameterBean getParameter() {
                        return parameter;
                    }

                    public void setParameter(ParameterBean parameter) {
                        this.parameter = parameter;
                    }

                    public static class ParameterBean implements Serializable {
                        /**
                         * parameterName : 多雲時晴
                         * parameterValue : 3
                         */

                        @SerializedName("parameterName")
                        private String parameterName;

                        @SerializedName("parameterValue")
                        private String parameterValue;

                        @SerializedName("parameterUnit")
                        private String parameterUnit;

                        public String getParameterName() {
                            return parameterName;
                        }

                        public void setParameterName(String parameterName) {
                            this.parameterName = parameterName;
                        }

                        public String getParameterValue() {
                            return parameterValue;
                        }

                        public void setParameterValue(String parameterValue) {
                            this.parameterValue = parameterValue;
                        }

                        public String getParameterUnit() {
                            return parameterUnit;
                        }

                        public void setParameterUnit(String parameterUnit) {
                            this.parameterUnit = parameterUnit;
                        }
                    }
                }
            }
        }
    }
}
