<template>
    <v-card outlined>
        <v-card-title>
            RegisterFeed
        </v-card-title>

        <v-card-text>
            <Number label="FeedingId" v-model="value.feedingId" :editMode="editMode"/>
            <Date label="FeedDate" v-model="value.feedDate" :editMode="editMode"/>
            <Number label="FeedQty" v-model="value.feedQty" :editMode="editMode"/>
            <String label="FoodType" v-model="value.foodType" :editMode="editMode"/>
            <Number label="Weight" v-model="value.weight" :editMode="editMode"/>
            <Number label="Strength" v-model="value.strength" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="registerFeed"
            >
                RegisterFeed
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
        name: 'RegisterFeedCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.feedingId = 0;
            this.value.feedDate = '2024-10-08';
            this.value.feedQty = 0;
            this.value.foodType = '';
            this.value.weight = 0;
            this.value.strength = 0;
        },
        watch: {
        },
        methods: {
            registerFeed() {
                this.$emit('registerFeed', this.value);
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

