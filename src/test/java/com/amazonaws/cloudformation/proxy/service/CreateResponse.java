package com.amazonaws.cloudformation.proxy.service;

import software.amazon.awssdk.awscore.AwsResponse;
import software.amazon.awssdk.core.SdkField;

import java.util.Collections;
import java.util.List;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString
public class CreateResponse extends AwsResponse {
    private final String repoName;
    private final String error;
    private CreateResponse(Builder b) {
        super(b);
        repoName = b.repoName;
        error = b.error;
    }

    @Override
    public Builder toBuilder() {
        return new Builder().repoName(repoName).error(error);
    }

    @Override
    public List<SdkField<?>> sdkFields() {
        return Collections.emptyList();
    }

    public static class Builder extends BuilderImpl {
        private String repoName;
        private String error;
        @Override
        public CreateResponse build() {
            return new CreateResponse(this);
        }

        public Builder repoName(String name) {
            this.repoName = name;
            return this;
        }

        public Builder error(String name) {
            this.error = name;
            return this;
        }
    }
}