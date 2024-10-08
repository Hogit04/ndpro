<template>
    <v-card outlined>
        <v-card-title>
            DeleteFeed
        </v-card-title>

        <v-card-text>
            <Number label="FeedingId" v-model="value.feedingId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="deleteFeed"
            >
                DeleteFeed
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'DeleteFeedCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.feedingId = 0;
        },
        watch: {
        },
        methods: {
            deleteFeed() {
                this.$emit('deleteFeed', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

